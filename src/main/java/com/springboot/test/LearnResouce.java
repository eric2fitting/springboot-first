package com.springboot.test;

public class LearnResouce {
    
    private String author;
    private String title;
    private String url;
    public String getAuthor() {
        return author;
    }
    public void setName(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTheme(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public LearnResouce(String author, String title, String url) {
        super();
        this.author = author;
        this.title = title;
        this.url = url;
    }
    
}
