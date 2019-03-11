package com.spring.aop.quickstart.quickstart.hello;

public class Phone {
    private String tel;
    private String brand;
    private double price;

    public Phone(String tel, String brand, double price) {
        this.tel = tel;
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
        super();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "tel='" + tel + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
