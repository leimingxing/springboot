package com.soaci.springboot.entity;

public class Product {


    private Integer pid;
    private String productName;
    private Float money;

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Product() {
    }

    public Product(Integer pid, String productName) {
        this.pid = pid;
        this.productName = productName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
