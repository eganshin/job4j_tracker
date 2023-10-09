package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book theCompleteReference = new Book("Java: The Complete Reference", 1345);
        Book grokkingAlgorithms = new Book("Grokking Algorithms", 256);
        Book thePhilosophyOfJava = new Book("The Philosophy of Java", 1170);
        Book cleanCode = new Book("Clean code", 462);
        Book[] book = new Book[4];
        book[0] = theCompleteReference;
        book[1] = grokkingAlgorithms;
        book[2] = thePhilosophyOfJava;
        book[3] = cleanCode;
        System.out.println("Before swapping:");
        for (Book index : book) {
            System.out.println("Book name: " + index.getBookName() + " all pages: " + index.getNumberOfPages());
        }
        Book swap = book[0];
        book[0] = book[3];
        book[3] = swap;
        System.out.println(System.lineSeparator() + "After swapping:");
        for (Book index : book) {
            System.out.println("Book name: " + index.getBookName() + " all pages: " + index.getNumberOfPages());
        }
        System.out.println(System.lineSeparator() + "Show only \"Clean code\":");
        for (Book index : book) {
            if ("Clean code".equals(index.getBookName())) {
                System.out.println("Book name: " + index.getBookName() + " all pages: " + index.getNumberOfPages());
            }
        }
    }
}