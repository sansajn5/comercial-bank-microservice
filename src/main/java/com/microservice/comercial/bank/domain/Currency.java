package com.microservice.comercial.bank.domain;

public class Currency {

    private String code;

    public Currency() {

    }

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
