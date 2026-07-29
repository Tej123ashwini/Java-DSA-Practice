package placement_Preparation;

import java.util.HashSet;

public class Containsduplicate {
                 // using hashset  and Time Complexity = O(n)
	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 1};

	        HashSet<Integer> set = new HashSet<>();

	        boolean duplicate = false;

	        for (int i = 0; i < arr.length; i++) {

	            if (set.contains(arr[i])) {

	                duplicate = true;
	                break;
	            }

	            set.add(arr[i]);
	        }

	        if (duplicate)
	            System.out.println("Duplicate Found");
	        else
	            System.out.println("No Duplicate");
	    }
	}
