package com.company.page;

import com.company.theme.Theme;

public class ContactPage extends WebPage{

    public ContactPage(Theme theme) {
        super(theme);
    }

    @Override
    public String getPage() {
        return "contact page with " + theme.getColor();
    }
}
