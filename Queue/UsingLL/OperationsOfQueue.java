// Queue : insert -- rear and delete -- front

import java.util.Scanner;

public class OperationsOfQueue {

    static Scanner sc = new Scanner(System.in);
    
    static Node front = null;
    static Node rear = null;

    public static void menu() {
        while(true) {

            System.err.println("\n---------- Implementation of Queue using Linkedlist ----------");
            System.out.println();
            System.out.println("\n1. Enqueue at rear end ");
            System.out.println("2. Enqueue at front end ");
            System.out.println("3. dequeue at front end ");
            System.out.println("4. dequeue at rear end ");
            System.out.println("5. Display ");
            System.out.println("6. front ");
            System.out.println("7. Exit ");

            System.out.println("\nEnter ur choice : ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    enqueueAtEnd();
                    break;

                case 2:
                    enqueueAtfront();
                    break;
                
                case 3:
                    dequeueAtfront();
                    break;

                case 4:
                    dequeueAtEnd();
                    break;

                case 5:
                    Display();
                    break;
                    
                case 6:
                    front();
                    break;
                
                case 7:
                    System.out.println("exiting..... ");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter valid choice.");
            }
        }
    }

    public static void enqueueAtEnd() {

        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(front == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted successfully.");
    }

    public static void enqueueAtfront() {
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(front == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            newNode.next = front;
            front = newNode;
        }

        System.out.println(data + " inserted successfully.");

    }

    public static void dequeueAtfront() {

        if(front == null) {
            System.out.print("Queue is empty. ");
            return;
        }
        
        int deletedData = front.data;
        front = front.next;

        System.out.println("Deleted data : " + deletedData);
    }

    public static void dequeueAtEnd() {

        if(front == null) {
            System.out.print("Queue is empty. ");
            return;
        }
        Node temp = front;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        int deletedData = temp.data;
        prev.next = null;

        System.out.println("Deleted data : " + deletedData);
    }


    public static void front() {
        if(front == null) {
            System.out.print("Queue is empty. ");
            return;
        }
        System.out.println("top data : " + front.data);
    }

    public static void Display() {
        if(front == null) {
            System.out.println(" Queue is empty. ");
            return;
        }
        Node temp = front;

        System.out.print("Linked list contains: ");

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        menu();
    }
}
