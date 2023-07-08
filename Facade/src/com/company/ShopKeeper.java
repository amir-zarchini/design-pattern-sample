package com.company;

public class ShopKeeper {

    private final SamsungMobile samsungMobile;
    private final IphoneMobile iphoneMobile;

    public ShopKeeper() {
        iphoneMobile = new IphoneMobile();
        samsungMobile = new SamsungMobile();
    }

    public void iphoneSale() {
        System.out.println("model: " + iphoneMobile.mobileModel() + " ,price: " + iphoneMobile.getPrice());
    }

    public void samsungSale() {
        System.out.println("model: " + samsungMobile.mobileModel() + " ,price: " + samsungMobile.getPrice());
    }
}
