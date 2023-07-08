package com.company;

public abstract class ActionListenerOption {

    Document document;

    public ActionListenerOption(Document document) {
        this.document = document;
    }

    abstract void execute();
}
