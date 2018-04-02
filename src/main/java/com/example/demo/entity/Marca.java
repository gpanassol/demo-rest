package com.example.demo.entity;

public class Marca {

    private final long id;
    private final String content;
    
    public Marca(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
	
}
