import java.util.Scanner;

public class Main {
    
    static Node head;
    static Scanner sc = new Scanner(System.in);

    public static void menu() {

        while(true) {

        System.out.println("\n1.Append a node at begin ");
        System.out.println("2.Append a node at end ");
        System.out.println("3.Append a node at position ");
        System.out.println("4.Delete the first node ");
        System.out.println("5.Delete the last node ");
        System.out.println("6.Delete a node by value ");
        System.out.println("7.Display the list ");
        System.out.println("8.Exit ");

        System.out.println("\n Enter your choice: ");
        int choice = sc.nextInt();

            switch(choice) {
            case 1:
                System.out.println("Enter the data to be inserted at the beginning: ");
                int data = sc.nextInt();
                insertAtBeginning(data);
                break;

            case 2:
                System.out.println("Enter the data to be inserted at the end: ");
                data = sc.nextInt();
                insertAtEnding(data);
                break;

            case 3:
                System.out.println("Enter the data to be inserted: ");
                data = sc.nextInt();
                System.out.println("Enter the position: ");
                int position = sc.nextInt();
                insertAtPosition(data, position);
                break;

            case 4:
                deleteFirstNode();
                break;

            case 5:
                deleteLastNode();
                break;

            case 6:
                System.out.println("Enter the value to be deleted: ");
                int value = sc.nextInt();
                deleteNodeByValue(value);
                break;

            case 7:
                displaytheNode();
                break;

            case 8:
                System.out.println("Thank you");
                return;
            
            }
        }
    }

    // insert at beginning
    public static void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    // insert at end
    public static void insertAtEnding(int data) {

    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node temp = head;

    while(temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
}

    // insert at position
    public static void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if (head == null) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete the first node
    public static void deleteFirstNode() {
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // delete the last node
    public static void deleteLastNode() {
        
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
        head = null;
        return;
    }

        Node temp = head;
        Node prev = null;

        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;

    }

    // delete a node by value
    public static void deleteNodeByValue(int value) {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.data == value) {
        head = head.next;
        return;
    }

    Node temp = head;

    while (temp.next != null) {

        if (temp.next.data == value) {
            temp.next = temp.next.next;
            return;
        }

        temp = temp.next;
    }

    System.out.println("Value not found");
}

    // display the list
    public static void displaytheNode() {
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


public static void main(String[] args) {

    menu();
    }
}
