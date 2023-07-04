package com.company;

public abstract class WebPage {

    protected Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    abstract String getPage();
}
