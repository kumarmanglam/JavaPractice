package org.javaCore.stream.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example2 {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Java Programming", 50);
        Book book2 = new Book("Data Structures", 40);
        Book book3 = new Book("Java Programming", 50); // Equal to book1
        Book book4 = new Book("Algorithms", 60);
        Book book5 = new Book("Data Structures", 40); // Equal to book2

        // Adding books to a list
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // ==: This operator compares the memory addresses of the objects
        System.out.println(book1 == book3);
        System.out.println(book1.equals(book3));   // Output: true (if equals method is overridden)


        // Printing the original list
        System.out.println("Original List:");
        books.forEach(System.out::println);

        // Using distinct() on a stream of books
        List<Book> distinctBooks = books.stream()
                .distinct()
                .collect(Collectors.toList());

        // Printing the list after applying distinct()
        System.out.println("\nDistinct List:");
        distinctBooks.forEach(System.out::println);
    }
}
