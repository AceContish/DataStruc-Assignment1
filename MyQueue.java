import java.util.*;;
public class MyQueue {
    private Node front;
    private Node rear;
    private Node newNode;

    // Constructor
    public MyQueue() {
        front = null;
        rear = null;
    }

    // Method isEmpty().This method to check whether queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method enqueue().This method to add new node on queue
    public void enqueue(BOOK b) {
        newNode = new Node(b);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method dequeue(). This method to remove front node from queue
    public BOOK dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            BOOK b = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return b;
        }
    }

    // Method displayQueue().This method to display all object stored inside MyQueue
    public void displayQueue() {
        Node current = front;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    // Method displayBOOKsBeforeYear().This method to check all the book before specific given year 
    public void displayBOOKsBeforeYear(int year) {
        Node current = front;
        while (current != null) {
            if (current.data.getYear_publish() < year) {
                System.out.println(current.data.toString());
            }
            current = current.next;
        }
    }

    // Method displayHighestAndLowestPrices().This method to check highest and lowest price of the book stored inside MyQueue
    public void displayHighestAndLowestPrices() {
        Node current = front;
        double highestPrice = Double.MIN_VALUE;
        double lowestPrice = Double.MAX_VALUE;
        BOOK highestPriceBOOK = null;
        BOOK lowestPriceBOOK = null;
        while (current != null) {
            if (current.data.getPrice() > highestPrice) {
                highestPrice = current.data.getPrice();
                highestPriceBOOK = current.data;
            }
            if (current.data.getPrice() < lowestPrice) {
                lowestPrice = current.data.getPrice();
                lowestPriceBOOK = current.data;
            }
            current = current.next;
        }
        System.out.println("BOOK with the highest price: \n" + highestPriceBOOK.toString());
        System.out.println("BOOK with the lowest price: \n" + lowestPriceBOOK.toString());
    }

    /*Method copyBOOKsBeforeYear(). This method function is to copy every object from BOOK class that 
      stored inside MyQueue instances that met specific year to store inside new instance which is BookQOld
    */ 
    
    public MyQueue copyBOOKsBeforeYear(int year) {
        MyQueue bookQOld = new MyQueue();
        Node current = front;
        while (current != null) {
            if (current.data.getYear_publish() < year) {
                bookQOld.enqueue(current.data);
            }
            current = current.next;
        }
        return bookQOld;
    }

    //This private class function is to create an linked list
    //Data is actually object that will store data from BOOK class
    //Node is reference address for Linked List to connected with next node
    private class Node {
        private BOOK data;
        private Node next;

        private Node(BOOK b) {
            data = b;
            next = null;
        }
    }
}
