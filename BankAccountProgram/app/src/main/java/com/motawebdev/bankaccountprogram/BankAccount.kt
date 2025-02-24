package com.motawebdev.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("Deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            transactionHistory.add("Withdrew $$amount")
        } else {
            println("Insufficient funds")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction History for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
}