package com.tinthon.springtest.model;

/**
 * Created by sidney on 2016/7/26.
 */
public class Order {

    private int id;
    private String orderNo;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getPrice() {
        return price;
}

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price+ "]";
    }
}
