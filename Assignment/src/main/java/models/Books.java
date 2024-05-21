package models;

public class Books {
    private int id;
    private String name;
    private String author;
    private int yearPublished;

    public Books(int id, String name, String author, int yearPublished) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "\n" +
                "Name: " + name + "\n" +
                "ID: " + id + "\n"+
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished
                ;
    }
}
