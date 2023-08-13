package com.example.ecocity;

public class RememberState {
    private static String type = "";

    public static void setType(String type) {
        RememberState.type = type;
    }

    public static void commit(String title, String text){
        EventManager.addEvent(new Event(title,type,text,R.drawable.ic_launcher_background));
    }
}
