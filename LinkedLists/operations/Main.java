import java.util.Scanner;

public class Main {

    static Node head;
    static Scanner sc = new Scanner(System.in);

    public static void menu() {

        while (true) {

            System.out.println("\n1.Append a node at begin ");
            System.out.println("2.Append a node at end ");
            System.out.println("3.Append a node at position ");
            System.out.println("4.Delete the first node ");
            System.out.println("5.Delete the last node ");
            System.out.println("6.Delete a node by value ");
            System.out.println("7.Display the list ");
            System.out.println("8.Exit ");

            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

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
                    System.out.println("First node deleted in LL.");
                    break;

                case 5:
                    deleteLastNode();
                    System.out.println("Last node deleted in LL.");
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
                    reverseLL();
                    break;

                case 9:
                    System.out.println("Thank you");
                    return;
            }
        }
    }

    // Insert at beginning
    public static Node insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    // Insert at end
    public static Node insertAtEnding(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Insert at position
    public static Node insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        if (head == null) {
            System.out.println("Invalid position");
            return head;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid position");
                return head;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete the first node
    public static Node deleteFirstNode() {

        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        head = head.next;

        return head;
    }

    // Delete the last node
    public static Node deleteLastNode() {

        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        if (head.next == null) {
            head = null;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;

        return head;
    }

    // Delete a node by value
    public static Node deleteNodeByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        if (head.data == value) {
            head = head.next;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        System.out.println("Value not found");

        return head;
    }

    // Display the list
    public static Node displaytheNode() {

        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print("Linked list contains: " + temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

        return head;
    }

    public static Node reverseLL() {
        
        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
           Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }

    public static void main(String[] args) {

        menu();
    }
}
