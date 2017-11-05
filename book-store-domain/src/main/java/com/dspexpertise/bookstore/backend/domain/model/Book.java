package com.dspexpertise.bookstore.backend.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by patrick on 23/10/17.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "author_id")
    private Author author;

    protected Book(){}

    public Book(String title, String description, Author author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
