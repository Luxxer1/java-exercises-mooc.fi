/*
    Method public String getAuthor() that returns the book's author's name.
    Method public String getName() that returns the name of the book.
    Method public int getPages() that returns the number of pages in the book.

 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString() {
        return getAuthor() + ", " + getName() + ", " + getPages() + " pages";
    }
}
