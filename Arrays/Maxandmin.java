package placement_Preparation;

import java.util.Scanner;

public class Maxandmin {

	// Time Complexity = O(n)
	
	    public static void main(String[] args) {

	    	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	    	// int[] arr = {12, 45, 3, 78, 19};

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {

	            if (arr[i] > max) {
	                max = arr[i];
	            }

	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	    }
	}