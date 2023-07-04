package com.company;

public class AboutPage extends WebPage {

    AboutPage(Theme theme) {
        super(theme);
    }

    @Override
    String getPage() {
        return "about page with " + theme.getColor();
    }
}
