package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //Creating object Library with objects Book
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title "+n, "Author " +n,
                        LocalDate.of(2000+n, Month.JANUARY, 10))));

        //Making a shallow copy of object Library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title 0", "Author 0",
                LocalDate.of(2000, Month.JANUARY, 9)));

        //When&Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(6,library.getBooks().size());
        Assertions.assertEquals(6,shallowClonedLibrary.getBooks().size());
        Assertions.assertEquals(5,deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        Assertions.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }

}
