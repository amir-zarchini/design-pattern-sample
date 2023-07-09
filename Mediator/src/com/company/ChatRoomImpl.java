package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImpl implements ChatRoom{

    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMessage(String message, Participation participation) {
        System.out.println("[" + dateFormat.format(date) + "] " + participation.getName() + ": " + message);
    }
}
