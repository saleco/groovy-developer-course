package com.github.saleco

@groovy.transform.ToString
class Account2 {

    BigDecimal balance = 0

    def deposit(BigDecimal amount) {
        if(amount < BigDecimal.ZERO) {
            throw new Exception("Negative values not allowed")
        }
        balance+= amount
    }

    def deposit(List amounts) {
        amounts.each {deposit(it as BigDecimal)}
    }

}

Account2 account2 = new Account2()
account2.deposit(20 as BigDecimal)

try {
    account2.deposit(-10 as BigDecimal)
} catch (Exception e) {
    println e.message
}

try {
    account2.deposit([10,50,25, -10])
} catch (Exception e ) {
    println e.message
}

println account2.balance




