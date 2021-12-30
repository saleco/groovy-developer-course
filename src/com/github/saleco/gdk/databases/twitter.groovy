import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "root"
String password = ""

def sql = Sql.newInstance("jdbc:mysql//localhost:3306/twitter", username, password, "com.mysql.jdbc.Driver")
println "Connected"

//creat schema
sql.execute("DROP TABLE IF EXISTS users")
sql.execute('''
    CREATE TABLE users (
        id INT NOT NULL,
        username VARCHAR(25) NOT NULL,
        bio VARCHAR (45) NULL,
        PRIMARY KEY (id)
    )
''')

sql.execute('''
    INSERT INTO users (id,username, bio) VALUES (1, 'saleco', 'Software Developer')
''')

def twitterUser = [id:2, username: 'dan', bio: 'Blogger']

sql.execute("""
    INSERT INTO users (id,username, bio) VALUES (${twitterUser.id}, ${twitterUser.username}, ${twitterUser.bio})
""")


List<GroovyRowResult> users = sql.rows("select * from users")
println users

sql.eachRow('select * from users') {row ->
    println "Tweet @${row.username}"
}


//calling close manually
sql.close()