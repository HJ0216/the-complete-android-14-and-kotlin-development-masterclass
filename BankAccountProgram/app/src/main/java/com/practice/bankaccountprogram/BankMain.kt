package com.practice.bankaccountprogram

fun main(){
    val hyunjisBankAccount = BankAccount("Hyunji", 450)

    hyunjisBankAccount.withdraw(1000)
    hyunjisBankAccount.deposit(2000)
    hyunjisBankAccount.withdraw(1500)
    hyunjisBankAccount.displayTransaction()
    hyunjisBankAccount.acctBalance()

    val sarahBankAccount = BankAccount("Sarah", 0)
    sarahBankAccount.deposit(300)
    sarahBankAccount.withdraw(10)
    sarahBankAccount.deposit(600)
    sarahBankAccount.acctBalance()
    sarahBankAccount.displayTransaction()

}