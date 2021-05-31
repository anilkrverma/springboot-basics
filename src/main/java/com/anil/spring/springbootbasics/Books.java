package com.anil.spring.springbootbasics;

public class Books {
    private int id;
    private String name;
    private String author;

    public Books(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
