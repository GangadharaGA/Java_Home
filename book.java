package com.example.mslabspringboottest.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class book {

    @Id
    private String id;
    @Column
    private String bookname;
    @Column
    private String bookauthor;

    public book() {
    }

    public book(String id, String bookname, String bookauthor) {
        this.id = id;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
}

