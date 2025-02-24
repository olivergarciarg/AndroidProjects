package com.motawebdev.bankaccountprogram

fun main() {
    val denisesBankAccount = BankAccount("Denis", 100.0)
    println(denisesBankAccount.accountHolder)

    denisesBankAccount.deposit(50.0)
    denisesBankAccount.withdraw(25.0)
    denisesBankAccount.withdraw(100.0)
    denisesBankAccount.displayTransactionHistory()
    println("${denisesBankAccount.accountHolder} Current balance: $${denisesBankAccount.balance}")
}