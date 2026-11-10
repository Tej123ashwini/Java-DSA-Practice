
import java.util.Scanner;


class operationsOfQueue {

    static Scanner sc = new Scanner(System.in);
    static int[] arr;
    static int front = -1;
    static int rear = -1;
    static int size = 0;

    public static void menu() {
        System.out.println("---------------------- Implemented Queue Operations using Array --------------------------");
        while(true) {

            System.out.println();
            System.out.println("1.Enqueue(from rear end) ");
            System.out.println("2.dequeue(from rear end) ");
            System.out.println("3.front(like peek) ");
            System.out.println("4.Display ");
            System.out.println("5.isEmpty ");
            System.out.println("6.isFull ");
            System.out.println("7.Exit ");

            System.out.println("\nEnter your choice : ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    enqueue();
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    front();
                    break;

                case 4:
                    Display();
                    break;

                case 5:
                    System.out.println("Is queue empty? " + isEmpty());
                    break;

                case 6:
                    System.out.println("Is queue full? " + isFull());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Please enter valid choice.");
            }

        }
    }

    public static void enqueue() {

        if(rear == arr.length-1) {
            System.out.println("Queue is full.");
            return;
        }

        System.out.println("Enter the element: ");
        int num = sc.nextInt();

        if(front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = num;
        size++;

        System.out.println(num + " inserted successfully.");

    }

    public static void dequeue() {
        if(front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        int del = arr[front];
        System.out.println(del + " is removed from queue.");
        front++;
        size--;

        if(front > rear) {
            front = -1;
            rear = -1;
        }
    }

    public static void front() {
        if(front == arr.length-1) {
            System.out.println("Queue is full.");
            return;
        }

        System.out.println("top element is: " + arr[front]);
    }

    public static void Display() {
        if(front == arr.length-1) {
            System.out.println("Queue is full.");
            return;
        }

        System.out.print("Elements are: ");
        for(int i=front;i<=rear;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isEmpty() {
        return size == 0;
    }
    
    public static boolean isFull() {
        return rear == arr.length-1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();

        arr = new int[n];
        menu();
    }
}
