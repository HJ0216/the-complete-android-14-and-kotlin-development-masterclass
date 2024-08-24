package com.practice.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Int) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Int){
        balance += amount
        transactionHistory.add("$accountHolder deposited $amount won.")

    }
    fun withdraw(amount: Int){
        if(amount < balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $amount won.")
        }else{
            println("You don't have the funds to withdraw $amount won.")
        }
    }
    fun displayTransaction(){
        println("Transaction History for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }
    fun acctBalance(){
        println("$accountHolder's balance is $balance")
    }
}