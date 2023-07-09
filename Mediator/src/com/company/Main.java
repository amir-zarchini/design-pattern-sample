package com.company;

public class Main {

    public static void main(String[] args) {
        ChatRoom chat = new ChatRoomImpl();

        User1 u1=new User1(chat, "user1");
        u1.sendMessage("Hi user1! how are you?");


        User2 u2=new User2(chat, "user2");
        u2.sendMessage("I am Fine ! You tell?");
    }
}
