package LabTask1.src;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private String finishDate;

    public Book(String title, String author, String genre, int pages, String finishDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.finishDate = finishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public String getFinishDate() {
        return finishDate;
    }
}