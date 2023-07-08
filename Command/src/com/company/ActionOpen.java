package com.company;

public class ActionOpen extends ActionListenerOption{

    public ActionOpen(Document document) {
        super(document);
    }

    public void execute() {
        document.open();
    }
}
