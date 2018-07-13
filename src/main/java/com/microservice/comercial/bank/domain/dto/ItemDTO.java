package com.microservice.comercial.bank.domain.dto;

import com.microservice.comercial.bank.domain.Transaction;

public class ItemDTO {

    private String createdDate;
    private Transaction transaction;

    public ItemDTO() {

    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
