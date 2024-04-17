package com.vinicius.bank.account;

import com.vinicius.bank.transaction.Transaction;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String sortCode;

    private String accountNumber;

    private double currentBalance;

    private String bankName;

    private String ownerName;

    private transient List<Transaction> transactions;

    protected Account() {
    }

    public Account(String sortCode, String accountNumber, double currentBalance, String bankName, String ownerName, List<Transaction> transactions) {
            this.sortCode = sortCode;
            this.accountNumber = accountNumber;
            this.currentBalance = currentBalance;
            this.bankName = bankName;
            this.ownerName = ownerName;
            this.transactions = transactions;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", currentBalance=" + currentBalance +
                ", bankName='" + bankName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
