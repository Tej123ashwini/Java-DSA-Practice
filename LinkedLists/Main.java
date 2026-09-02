public class Main {
    
    static Node head;

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
}
