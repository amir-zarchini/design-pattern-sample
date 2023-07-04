package com.company;

import com.company.page.AboutPage;
import com.company.page.ContactPage;
import com.company.page.WebPage;
import com.company.theme.DarkTheme;
import com.company.theme.LightTheme;

public class Main {

    public static void main(String[] args) {

     WebPage aboutPageDarkTheme = new AboutPage(new DarkTheme());
        System.out.println(aboutPageDarkTheme.getPage());

     WebPage aboutPageLightTheme = new AboutPage(new LightTheme());
        System.out.println(aboutPageLightTheme.getPage());

     WebPage contactPageDarkTheme = new ContactPage(new DarkTheme());
        System.out.println(contactPageDarkTheme.getPage());

     WebPage contactPageLightTheme = new ContactPage(new LightTheme());
        System.out.println(contactPageLightTheme.getPage());
    }
}
