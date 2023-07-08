package com.company;

public class ActionSave extends ActionListenerOption {

    public ActionSave(Document document) {
        super(document);
    }

    public void execute() {
        document.save();
    }
}
