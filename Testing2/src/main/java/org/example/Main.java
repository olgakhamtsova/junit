package org.example;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир", 1867, author, 1300);

        //System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
    }

}