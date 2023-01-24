package com.practice.springboot.springbootpractice.Topics;

public class Topic {
    private int id;
    private String name;
    private String desciption;

    public Topic(int id, String name, String desciption) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
    }

    public Topic() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }
}
