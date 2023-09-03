package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Jan Nowak", "Biografia Nowaka", 2023, "0001"));
        books.add(new Book("Grzegorz Kowalski","Praca Kowala", 2022, "0002"));
        books.add(new Book("Kamil Ślimak", "Czytane wspak", 2021, "0003"));
        books.add(new Book("Barbara Kapibara", "Wymowa R", 2020, "0004"));
        books.add(new Book("Henryk Sienkiewicz", "Nowego pokolenia", 2019, "555"));
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        Assertions.assertEquals(2021, median);

    }
}