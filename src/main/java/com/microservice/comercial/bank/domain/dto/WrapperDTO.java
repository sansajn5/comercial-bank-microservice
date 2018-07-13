package com.microservice.comercial.bank.domain.dto;

import com.microservice.comercial.bank.domain.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class WrapperDTO {

    private List<BankAccount> list = new ArrayList<>();

    public WrapperDTO() {

    }

    public WrapperDTO(List<BankAccount> list) {
        this.list = list;
    }

    public List<BankAccount> getList() {
        return list;
    }

    public void setList(List<BankAccount> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "WrapperDTO{" +
                "list=" + list +
                '}';
    }
}
