package com.company.page;

import com.company.theme.Theme;

public abstract class WebPage {

    protected Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    public abstract String getPage();
}
