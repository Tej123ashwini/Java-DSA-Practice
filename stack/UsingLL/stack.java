package UsingLL;

import java.util.Scanner;


public class stack {

    static Scanner sc = new Scanner(System.in);
    static Node top;
    static int size;

    stack() {
        top = null;
        size = 0;
    }

    public static void menu() {
        int choice;

        do {
            System.out.println();
            System.out.println("\nImplementation of Stack using LL");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter the data : ");
                    int data = sc.nextInt();
                    push(data);
                    break;

                case 2:
                    int popped = pop();
                    if(popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    int element = peek();
                    if(element != -1) {
                        System.out.println("Top element: " + element);
                    }
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }

    public static void push(int data) {

        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        size++;

        System.out.println("Element pushed successfully.");
    }

    public static int pop() {
        if(top == null) {
            System.out.println("Underflow.");
            return -1;
        }
        else {
            int x = top.data;
            top = top.next;
            size--;
            return x;
        }
    }

    public static boolean isEmpty() {
        return top == null;
    }

    public static int peek() {
        if(isEmpty()) {
            System.out.println("underflow..");
            return -1;
        }
        return top.data;
    }

    public static int display() {

        if (top == null) {
            System.out.println("underflow..");
            return -1;
        }

        Node current  = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current  = current .next;
        }
        return 0;
    }

    public static void main(String[] args) {

        stack s = new stack();
        menu();
    }

}
