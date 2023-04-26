import java.util.Scanner;

public class BOOK {
    private String title;
    private int year_publish;
    private double price;
    private String author;

    //Normal constructor method to store data given by user input from AppMyQueueBook class
    BOOK(String title, int year_publish, double price, String author){
        this.title = title;
        this.year_publish = year_publish;
        this.price = price;
        this.author = author;
    }

    //Accessor Method. This method function is to retrieve data that stored inside BOOK class
    public String getTitle(){
        return title;
    }
    public int getYear_publish() {
        return year_publish;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }

    //Print Method for display all data members that has been stored inside BOOK class. 
    //Note: When call this method all data members will be displayed according to return keyword
    public String toString() {
        return "Title: " + title + "\nYear Publish: " + year_publish + "\nPrice: " + price + "\nAuthor: " + author;
    }
}
