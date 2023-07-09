package com.company;

public class User2 extends Participation{
    ChatRoom chatRoom;
    String name;

    public User2(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chatRoom.showMessage(message,this);
    }


    @Override
    public String getName() {
        return name;
    }
}
