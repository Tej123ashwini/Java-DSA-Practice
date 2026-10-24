package stack.UsingArrays;

import java.util.Scanner;

public class StackOperations {

    static Scanner sc = new Scanner(System.in);
    static int[] stack;
    static int top = -1;

    public static void menu() {
        int choice;

        do {
            System.out.println("\nImplementation of Stack using Arrays");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    push();
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
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

    public static void push() {
        System.out.print("Enter the element to be pushed: ");
        int element = sc.nextInt();

        if (top == stack.length - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stack[top] = element;

            System.out.println("The element " + element
                    + " is pushed onto the stack.");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            int deletedElement = stack[top];
            top--;

            System.out.println("The element " + deletedElement
                    + " is popped from the stack.");
        }
    }

    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("The top element is " + stack[top]);
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are : ");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Stack size must be greater than zero.");
            sc.close();
            return;
        }

        stack = new int[n];

        menu();

        sc.close();
    }
}

