package com.examly.springapp.model;

public class Laptop {
    private int laptopId;
    private String laptopBrand;
    private String laptopPrice;
    public Laptop() {
    }
    public int getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }
    public String getLaptopBrand() {
        return laptopBrand;
    }
    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }
    public String getLaptopPrice() {
        return laptopPrice;
    }
    public void setLaptopPrice(String laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
    public Laptop(int laptopId, String laptopBrand, String laptopPrice) {
        this.laptopId = laptopId;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    
    

    
}
