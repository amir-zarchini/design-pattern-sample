package com.company;

public class Main {

    public static void main(String[] args) {
     WebPage aboutPage = new AboutPage(new DarkTheme());
     System.out.println(aboutPage.getPage());
    }
}
