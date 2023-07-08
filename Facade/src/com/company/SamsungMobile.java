package com.company;

public class SamsungMobile implements MobileShop {
    @Override
    public String mobileModel() {
        return "s 20";
    }

    @Override
    public String getPrice() {
        return "200000";
    }
}
