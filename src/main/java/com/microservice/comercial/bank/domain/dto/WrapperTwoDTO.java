package com.microservice.comercial.bank.domain.dto;

import java.util.ArrayList;
import java.util.List;

public class WrapperTwoDTO {

    private List<ItemDTO> list = new ArrayList<>();
    private String value;

    public WrapperTwoDTO() {

    }

    public List<ItemDTO> getList() {
        return list;
    }

    public void setList(List<ItemDTO> list) {
        this.list = list;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
