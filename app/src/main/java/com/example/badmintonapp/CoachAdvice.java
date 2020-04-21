package com.example.badmintonapp;

public class CoachAdvice {


    String name;
    String email = "";
    String topic;
    String description;

    public CoachAdvice(String name, String email, String topic, String description){
        this.name = name;
        this.email = email;
        this.topic = topic;
        this.description = description;
    }

    public String getName(){
        return name;
    }


    public String getEmail(){
        return email;
    }


    public String getTopic(){
        return topic;
    }

    public String getDescription(){
        return description;
    }
}

