package LabTask1;

import java.util.Date;

public class Book{
    private String title;
    private String author;
    private String genre;
    private int pageCount;
    private Date finishDate;

    public Book(String title, String author, String genre, int pageCount, Date finishDate){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.pageCount=pageCount;
        this.finishDate=finishDate;
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
    public int getPageCount() {
        return pageCount;
    }

    public Date getFinishDate() {
        return finishDate;
    }
    
}