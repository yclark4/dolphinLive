package com.zybooks.dolphinlive.entities;

import kotlin.experimental.ExperimentalTypeInference;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="products")
public class Product {
    @PrimaryKey(autoGenerate = true)
    private int productID;
    private String productName;
    private double productPrice;

    public Product() {
    }

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
