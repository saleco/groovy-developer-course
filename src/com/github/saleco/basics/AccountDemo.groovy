package com.github.saleco.basics

@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal amount) {
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount) {
        balance -= amount
    }

    BigDecimal plus(Account other) {
        this.balance + other.balance
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type: "Savings")
savings.deposit(50.00)

BigDecimal total = checking + savings
println total

def nums = [1,2,3,5,7,8,3,5,2,6]


println nums








