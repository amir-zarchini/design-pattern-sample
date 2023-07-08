package com.company;

public class Main {

    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerOption clickOpen = new ActionOpen(doc);
        ActionListenerOption clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
