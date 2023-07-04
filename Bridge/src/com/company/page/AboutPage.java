package com.company.page;

import com.company.page.WebPage;
import com.company.theme.Theme;

public class AboutPage extends WebPage {

    public AboutPage(Theme theme) {
        super(theme);
    }

    @Override
    public String getPage() {
        return "about page with " + theme.getColor();
    }
}
