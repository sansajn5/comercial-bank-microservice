package com.microservice.comercial.bank.domain;

public class Transaction {

    private String type;
    private Integer sum;
    private String code;
    private Boolean emergency;
    private String purposeOfPayment;
    private String accountCreditorXML;
    private String debtorAccountXML;
    private String paymentCurrencyXML;

    public Transaction() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getEmergency() {
        return emergency;
    }

    public void setEmergency(Boolean emergency) {
        this.emergency = emergency;
    }

    public String getPurposeOfPayment() {
        return purposeOfPayment;
    }

    public void setPurposeOfPayment(String purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
    }

    public String getAccountCreditorXML() {
        return accountCreditorXML;
    }

    public void setAccountCreditorXML(String accountCreditorXML) {
        this.accountCreditorXML = accountCreditorXML;
    }

    public String getDebtorAccountXML() {
        return debtorAccountXML;
    }

    public void setDebtorAccountXML(String debtorAccountXML) {
        this.debtorAccountXML = debtorAccountXML;
    }

    public String getPaymentCurrencyXML() {
        return paymentCurrencyXML;
    }

    public void setPaymentCurrencyXML(String paymentCurrencyXML) {
        this.paymentCurrencyXML = paymentCurrencyXML;
    }
}
