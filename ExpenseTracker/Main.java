package ExpenseTracker;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Expense> ex = new LinkedList<>();


    public static void MenuBar() {
        System.out.println("\n ===========   Expense Tracker  =============");
        System.out.println();

        while(true) {

        System.out.println("\n1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Delete Expense");
        System.out.println("4. Search Expense");
        System.out.println("5. Total Expenses");
        System.out.println("6. Exit");

        System.out.println("\nEnter your choice : ");
        int choice = sc.nextInt();
        System.out.println();

        switch(choice) {

            case 1:
                AddExpense();
                break;

            case 2:
                DisplayExpense();
                break;

            case 3:
                DeleteExpense();
                break;

            case 4:
                SearchExpense();
                break;

            case 5:
                TotalExpense();
                break;

            case 6:
                System.out.println("Thank you...");
                return;

            default:
                System.out.println("Invalid choice. Please try again.");

        }
        }
    }


    public static void AddExpense() {

        //id
        System.out.println("Enter the id : ");
        int id = sc.nextInt();
        sc.nextLine();

        while(id <= 0) {
            System.out.println("Invalid id. Please enter the valid id.");
            System.out.println("Enter the id : ");
            id = sc.nextInt();
            sc.nextLine();
        }

        //Description
        System.out.println("write the description of the expense : ");
        String desc = sc.nextLine();

        while(desc.trim().isEmpty()) {
            System.out.println("Description can not be empty.");

            System.out.println("write the description of the expense : ");
            desc = sc.nextLine();
        }

        //amt
        System.out.println("Enter the amount : ");
        Double amount = sc.nextDouble();
        sc.nextLine();

        //category
        System.out.println("Enter the category : ");
        String category = sc.nextLine();

        //create the object
        Expense expense = new Expense(id, desc, amount, category);

        //Add the values into LinkedList
        ex.add(expense);

        System.out.println("Expense successfully added.\n");
    }

    public static void DisplayExpense() {
        if(ex.isEmpty()) {
            System.out.println("Not yet added.");
            return;
        }

        //print the data
        System.out.println("----------------All expenses----------------\n");

        System.out.printf("%-7s %-10s %-13s %-10s%n", "ID", "Desc", "Amount", "Category");

        for(Expense ll : ex) {

            System.out.printf("%-7s %-10s %-13s %-10s%n", ll.id, ll.desc, ll.amount, ll.category);

            // System.out.println("id: " + ll.id + "\n" +
            //                     "Desc : " + ll.desc + "\n" +
            //                     "amount : Ru. " + ll.amount + "\n" +
            //                     "category: " + ll.category + "\n" );
        }
    }

    public static void DeleteExpense() {

    }

    public static void SearchExpense() {

        System.out.println("Search the expenses by entering the id: ");
	    int search = sc.nextInt();
        System.out.println();
	    boolean found = false;

        System.out.printf("%-7s %-10s %-13s %-10s%n", "ID", "Desc", "Amount", "Category");

	    	 for(Expense ll : ex) {
	    		 if(ll.id == search) {

                    System.out.printf("%-7s %-10s %-13s %-10s%n", ll.id, ll.desc, ll.amount, ll.category);

	    			 found = true;
	    		 }
	    	 }
	    	 if(!found)
	  		   System.out.println("Expense not found..\n");
    }

    public static void TotalExpense() {

    }


    public static void main(String[] args) {

        MenuBar();
    }
}
