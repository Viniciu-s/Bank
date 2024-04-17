package com.vinicius.bank.transaction;

import com.vinicius.bank.account.Account;
import com.vinicius.bank.utils.TransactionInput;

public interface ITransactionService {

    boolean makeTransfer(TransactionInput transactionInput);
    void updateAccountBalance(Account account, double amount, Action action);
    boolean isAmountAvailable(double amount, double accountBalance);
}
