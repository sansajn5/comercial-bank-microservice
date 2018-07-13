package com.microservice.comercial.bank.domain;

public class BankAccount {

    private String number;
    private String createdDate;
    private Boolean mailReporting;
    private Boolean valid;
    private Currency currency;
    private Owner owner;

    public BankAccount() {

    }

    public BankAccount(String number, String createdDate, Boolean mailReporting, Boolean valid,Currency currency, Owner owner) {
        this.number = number;
        this.createdDate = createdDate;
        this.mailReporting = mailReporting;
        this.valid = valid;
        this.currency = currency;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getMailReporting() {
        return mailReporting;
    }

    public void setMailReporting(Boolean mailReporting) {
        this.mailReporting = mailReporting;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number='" + number + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", mailReporting=" + mailReporting +
                ", valid=" + valid +
                ", currency=" + currency +
                ", owner=" + owner +
                '}';
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
