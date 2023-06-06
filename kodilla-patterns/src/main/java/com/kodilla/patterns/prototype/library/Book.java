package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;

import java.time.LocalDate;

public final class Book {

    final String title;
    final String author;
    final LocalDate publicationDate;

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        String s = "    Book [" + title + " " + author + " " + publicationDate + "]";
        return s;
    }
}