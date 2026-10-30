package ExpenseTracker;

import java.util.HashMap;
import java.util.Iterator;
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
        System.out.println("5. Update Expenses");
        System.out.println("6. Total Expenses");
        System.out.println("7. Category Expenses");
        System.out.println("8. Exit");

        System.out.println("\nEnter your choice : ");
        if(!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            sc.nextLine();
            continue;
        }
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
                UpdateExpense();
                break;

            case 6:
                TotalExpense();
                break;

            case 7:
                categoryExpenses();
                break;

            case 8:
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

        for(Expense ll : ex) {
            if(ll.id == id) {
                System.out.println("Id already exists. Please enter the valid id.");
                System.out.println("Enter the id : ");
                id = sc.nextInt();
                sc.nextLine();
            }
        }
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

        while(amount <= 0) {
            System.out.println("Invalid expense. Please enter the valid amount.");
            System.out.println("Enter the amount : ");
            amount = sc.nextDouble();
            sc.nextLine();
        }

        //category
        System.out.println("Enter the category : ");
        String category = sc.nextLine();

        while(category.trim().isEmpty()) {
            System.out.println("Category can not be empty.");

            System.out.println("Enter the category : ");
            category = sc.nextLine();
        }

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

            System.out.printf("%-7d %-15s ₹%-12.2f %-10s%n", ll.id, ll.desc, ll.amount, ll.category);

            // System.out.println("id: " + ll.id + "\n" +
            //                     "Desc : " + ll.desc + "\n" +
            //                     "amount : Ru. " + ll.amount + "\n" +
            //                     "category: " + ll.category + "\n" );
        }
    }


    public static void DeleteExpense() {
        if(ex.isEmpty()) {
            System.out.println("No expenses available to delete.");
            return;
        }
        System.out.println("delete the expense by entering the id: ");
        int delete = sc.nextInt();
        boolean found = false;

        Iterator<Expense> iterator = ex.iterator();

        while(iterator.hasNext()) {
            Expense ll = iterator.next();

            if(ll.id == delete) {
            iterator.remove();
            found = true;
            break;
            }
        }
        if(!found) {
            System.out.println("Does not contain that expense.");
        }
    }

    public static void SearchExpense() {

        if(ex.isEmpty()) {
            System.out.println("No expenses available to search.");
            return;
        }

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
	  		  System.out.println("\n Expense not found..\n");
    }


    public static void UpdateExpense() {
        if(ex.isEmpty()) {
            System.out.println("No expenses available to update.");
            return;
        }

        System.out.println("Update the expense by entering the id: ");
	    int update = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for(Expense ll : ex) {
            if(ll.id != update) {
                System.out.println("Id is not exists. Please enter the valid id.");
                System.out.println("Enter the id : ");
                update = sc.nextInt();
                sc.nextLine();
            }
        }

        for(Expense ll: ex) {
            if(ll.id == update) {
                System.out.println("Enter the new Description : ");
                ll.desc = sc.nextLine();

                while(ll.desc.trim().isEmpty()) {
                    System.out.println("Description can not be empty.");

                    System.out.println("write the description of the expense : ");
                    ll.desc = sc.nextLine();
                }

                System.out.println("Enter the new amount : ");
                ll.amount = sc.nextDouble();
                sc.nextLine();

                while(ll.amount <= 0) {
                    System.out.println("Invalid expense. Please enter the valid amount.");
                    System.out.println("Enter the amount : ");
                    ll.amount = sc.nextDouble();
                    sc.nextLine();
                }

                System.out.println("Enter the new category : ");
                ll.category = sc.nextLine();

                while(ll.category.trim().isEmpty()) {
                    System.out.println("Category can not be empty.");

                    System.out.println("Enter the category : ");
                    ll.category = sc.nextLine();
                }

                System.out.println("\nExpenses updated successfully.");
            }
        }
    }



    public static void TotalExpense() {
        if(ex.isEmpty()) {
            System.out.println("No expenses available.");
            return;
        }

        int count = 0;
        double totalAmount = 0.0;

        for(Expense ll : ex) {
            count++;
        }
        System.out.println("The total expenses are : " + count);

        for(Expense ll : ex) {
            totalAmount += ll.amount;
        }
        System.out.printf("Total amount is: ₹%.2f%n", totalAmount);    
    }


    public static void categoryExpenses() {
        if(ex.isEmpty()) {
            System.out.println("No expenses available.");
            return;
        }

        HashMap<String, Double> map = new HashMap<>();

        sc.nextLine();
        System.out.println("Enter the category to search for: ");
        String category = sc.nextLine();
        System.out.println();

        for(Expense ll : ex) {
            map.put(ll.category,map.getOrDefault(ll.category,0.0)+ll.amount);
        }

        if(map.containsKey(category)) {
            System.out.println(category + " total expenses amt is : " + map.get(category));
        }
        else {
            System.out.println(category + " category not found.");
        }
    }


    public static void main(String[] args) {

        MenuBar();
    }
}
