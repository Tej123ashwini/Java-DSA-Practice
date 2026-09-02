class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class basicsOfLL {
    public static void main(String[] args){

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node head = n1;

        try {
        System.out.println("\n" + head.data);
        System.out.println("\n" + head.next.data);
        System.out.println("\n" + head.next.next.data);
        System.out.println("\n" + head.next.next.next.data);
        System.out.println("\n" + head.next.next.next.next.data);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // System.out.println("\n" + head.data);
        // System.out.println("\n" + head.next.data);
        // System.out.println("\n" + head.next.next.data);
        // System.out.println("\n" + head.next.next.next.data);
        // System.out.println("\n" + head.next.next.next.next.data);

    }

}