package com.vinicius.bank.account;

public interface IAccountService {

    Account getAccount(String sortCode, String accountNumber);
    Account getAccount(String accountNumber);
    Account createAccount(String bankName, String ownerName);
}
