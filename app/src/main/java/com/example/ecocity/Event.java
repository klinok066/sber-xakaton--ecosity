package com.example.ecocity;

public class Event {
    private String title;
    private String type;
    private String text;
    private int pathToImage;


    public Event(String title, String type, String text, int pathToImage) {
        this.title = title;
        this.type = type;
        this.text = text;
        this.pathToImage = pathToImage;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public int getPathToImage() {
        return pathToImage;
    }
}
