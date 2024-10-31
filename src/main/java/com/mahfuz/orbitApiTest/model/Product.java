package com.mahfuz.orbitApiTest.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int productId;
    private String productName;
    private String pruductIcon;

    public Product() {
    }

    public Product(int productId, String productName, String pruductIcon) {
        this.productId = productId;
        this.productName = productName;
        this.pruductIcon = pruductIcon;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPruductIcon() {
        return pruductIcon;
    }

    public void setPruductIcon(String pruductIcon) {
        this.pruductIcon = pruductIcon;
    }
}
