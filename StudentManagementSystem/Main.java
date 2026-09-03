package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
		static String clgname = "P.E.S";
	    static Scanner sc = new Scanner(System.in);
	    static ArrayList<Student> st = new ArrayList<>();

	    public static void menu() {
	        System.out.println("Student Registration Form");
	        System.out.println();

	        while(true){

	            System.out.println("\n1.Add an student");
	            System.out.println("2.Display all students");
	            System.out.println("3.Search Student");
	            System.out.println("4.Delete a student:");
	            System.out.println("5.update a student:");
	            System.out.println("6.counta student:");
	            System.out.println("7.Highest marks of the student:");
	            System.out.println("8.Avg marks of the student:");
	            System.out.println("9.Exit");

	            System.out.println("\nEnter your choice: ");
	            int choice = sc.nextInt();

	            switch(choice) {
	                case 1:
	                    addStudent();
	                    break;
	                    
	                case 2:
	                    displayStudent();
	                    break;
	                    
	                case 3:
	                    searchStudent();
	                    break;
	                    
	                case 4:
	                   deleteStudent();
	                   break;
	                   
	                case 5:
	                	updateStudent();
	                	break;
	                	
	                case 6:
	                	countStudent();
	                	break;
	                	
	                case 7:
	                	highestMarks();
	                	break;
	                	
	                case 8:
	                	avgMarks();
	                	break;
	                   
	                case 9:
	                    System.out.println("Thank you! ");
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    public static void addStudent() {

	        // USN
	        System.out.println("Enter your USN:");
	        int USN = sc.nextInt();
	        sc.nextLine();

	        while (USN <= 0) {

	            System.out.println("Invalid USN. USN must be greater than 0.");
	            System.out.println("Enter your USN:");

	            USN = sc.nextInt();
	            sc.nextLine();
	        }


	        // Duplicate USN check
	        for (Student num : st) {

	            if (num.USN == USN) {

	                System.out.println("Student with USN " + USN + " already exists.");
	                return;
	            }
	        }


	        // Name
	        System.out.println("Enter your Name:");
	        String name = sc.nextLine();

	        while (name.trim().isEmpty()) {

	            System.out.println("Name cannot be empty.");
	            System.out.println("Enter your Name:");

	            name = sc.nextLine();
	        }


	        // Age
	        System.out.println("Enter your Age:");
	        int age = sc.nextInt();
	        sc.nextLine();


	        // Course
	        System.out.println("Enter your Course:");
	        String course = sc.nextLine();


	        // Marks
	        System.out.println("Enter your Marks:");
	        double marks = sc.nextDouble();

	        while (marks < 0 || marks > 100) {

	            System.out.println( "Invalid marks. Marks must be between 0 and 100.");

	            System.out.println("Enter your Marks:");
	            marks = sc.nextDouble();
	        }

	        // Create Student object
	        Student student = new Student(USN, name, age, course,marks);

	        // Add to ArrayList
	        st.add(student);

	        System.out.println("Student successfully added!\n");
	    }
	    
	    
	    
	     public static void displayStudent() {
	    	 if(st.isEmpty()) {
	    		 System.out.println("No students record found.\n");
	    	 }
	    	 
	    	 System.out.printf("%-7s %-10s %-13s %-10s %-20s%n",
	    	            "ID", "Name", "Department", "Marks", "Clg_name");

	    	    for (Student num : st) {

	    	        System.out.printf("%-7d %-10s %-13s %-10.1f %-20s%n",
	    	                num.USN,
	    	                num.name,
	    	                num.course,
	    	                num.marks,
	    	                Main.clgname);
	    	    }
	    	   
//	    		 System.out.println("Student USN: " + num.USN); 
//	    		 System.out.println("Student Name: " + num.name);
//	    		 System.out.println("Student Age: " + num.age);
//	    		 System.out.println("Student Course: " + num.course);
//	    		 System.out.println("Student Marks: " + num.marks + "\n");
//	    		 System.out.println("\n Displayed the all students Added.\n");
	    	 
	    }
	     
	     public static void searchStudent() {
	    	 System.out.println("Serach the student by entering the USN: ");
	    	 int search = sc.nextInt();
	    	 boolean found = false;
	    	 
	    	 for(Student num : st) {
	    		 if(num.USN == search) {
	    			 System.out.println("Student USN: " + num.USN); 
	        		 System.out.println("Student Name: " + num.name);
	        		 System.out.println("Student Age: " + num.age);
	        		 System.out.println("Student Course: " + num.course);
	        		 System.out.println("Student Marks: " + num.marks + "\n");
	        		 
	    			 found = true;
	    		 }
	    	 }
	    	 if(!found)
	  		   System.out.println("Student not found.\n");
	     }
	     
	     
	     public static void deleteStudent() {
	    	 System.out.println("delete the student by entering the USN: ");
	    	 int delete = sc.nextInt();
	    	 boolean found = false;

	    		    for (int i = 0; i < st.size(); i++) {
	    		        if (st.get(i).USN == delete) {
	    		            st.remove(i);
	    		            found = true;
	    		            break;
	    		        }
	    		    }
	    		    if (!found) {
	    		        System.out.println("Student not found.");
	    		    }
	     }
	     
	     
	     public static void updateStudent() {
	    	 System.out.println("update the student details by entering the USN: ");
	    	 int update = sc.nextInt();
	    	 
	    	 for(Student num : st) {
	    		 if(num.USN == update) {
	    			 sc.nextLine();
	    			 System.out.println("Enter the Student Name: ");
	    			 num.name = sc.nextLine();

	    			 System.out.println("Enter the Student Age: ");
	    	 		 num.age = sc.nextInt();
	    	 		 sc.nextLine();
	    	 		 
	    	 		 System.out.println("Enter the Student course: ");
	    	 		 num.course = sc.nextLine();
	    	 		 sc.nextLine();
	    	 		 
	    	 		 System.out.println("Enter the Student marks: ");
	    	 		 num.marks = sc.nextInt();
	    	 }
	       }
	  }
	    	 
	  public static int countStudent() {
		  System.out.println("Total students: " + st.size());
		  return 0;
	  }
	  
	  public static double highestMarks() {
		  double highmarks = st.get(0).marks;
		  for(Student num: st) {
			  if(num.marks > highmarks) {
				  highmarks = num.marks;
			  }
		  }
		  System.out.println("Highest marks: " + highmarks);
		  return 0;
	  }
	    
	  public static double avgMarks() {
		  double avgmarks = 0.0;
		  for(Student num : st) {
			  avgmarks += num.marks;
		  }
		  System.out.println("Average marks: " + avgmarks/st.size());
		  return 0;
	  }
	    	
	     
	    public static void main(String[] args) {

	    menu();
	    }
}
