package com.company;

public class MenuOptions {
    private final ActionListenerOption openCommand;
    private final ActionListenerOption saveCommand;

    public MenuOptions(ActionListenerOption open, ActionListenerOption save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
        openCommand.execute();
    }
    public void clickSave(){
        saveCommand.execute();
    }
}
