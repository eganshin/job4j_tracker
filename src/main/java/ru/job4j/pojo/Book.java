package ru.job4j.pojo;

public class Book {
    private String bookName;
    private int numberOfPages;

    public Book(String bookName, int numberOfPages) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
