package com.rolon.quarkus.data;

import javax.validation.constraints.NotBlank;

public class Book {
    @NotBlank(message = "Name shouldn't be blank")
    private String name;
    @NotBlank(message = "Author shouldn't be blank")
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Book(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
