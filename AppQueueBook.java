import java.util.Scanner;

public class AppQueueBook {
    public static void main(String[] args) {

        //Question a) Declare a queue of books object named BookQ
        MyQueue bookQ = new MyQueue();
        Scanner input = new Scanner(System.in);

        //Question b) Ask user to enter 10 Book objects into queue BookQ
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for BOOK #" + (i+1) + ":");
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            System.out.print("Year: ");
            int year = input.nextInt();
            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();
            BOOK b = new BOOK(title, year, price, author);
            bookQ.enqueue(b);
        }

        //Question c) Display all books details in BookQ
        System.out.println("All books in BookQ:");
        bookQ.displayQueue();
        System.out.println("---------------------------------\n");

        //Question d) Display all books which were published before the year 2020.
        System.out.println("Books published before year 2020:");
        bookQ.displayBOOKsBeforeYear(2020);
        System.out.println("---------------------------------\n");

        //Question e) Search and display the books with the highest and lowest prices
        System.out.println("Books with the highest and lowest prices:");
        bookQ.displayHighestAndLowestPrices();
        System.out.println("---------------------------------\n");

        /*Question f) Declare another queue of book objects named BookQOld, all books
        published before year 1990 should be copied into this queue.*/
        MyQueue bookQOld = bookQ.copyBOOKsBeforeYear(1990);

        //Question g) Display all books in BookQOld.
        System.out.println("All books published before 1990:");
        bookQOld.displayQueue();
    }
}