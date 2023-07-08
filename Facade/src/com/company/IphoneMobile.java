package com.company;

public class IphoneMobile implements MobileShop{
    @Override
    public String mobileModel() {
        return "iphone x";
    }

    @Override
    public String getPrice() {
        return "100000";
    }
}
