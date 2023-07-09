package com.company;

public class User2 extends Participation{
    ChatRoom chatRoom;
    String name;

    public User2(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        chatRoom.showMessage(message,this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
