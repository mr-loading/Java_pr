import java.lang.*;

public class Book {
    private String author;
    private int numOfPages;

    public Book(String author, int numOfPages){
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public Book(String author){
        this.author = author;
    }

    public Book(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public String getAuthor(){
        return author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String toString(){
        return author + ", " + numOfPages;
    }
}
