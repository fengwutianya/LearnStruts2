package com.xuan;

/**
 * Created by xuan on 2017/2/28 0028.
 */
public class Product {
    private String productName;
    private String productDesc;
    private double productPrice;
    private int productId;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String save() throws Exception {
        System.out.println("save done...");
        return "success";
    }
}
