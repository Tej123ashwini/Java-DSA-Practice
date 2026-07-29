package placement_Preparation;

public class Checkarrayissorted {

	// Time Complexity = O(n)
	
	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 40, 50};

	        int i = 0;
	        int j = 1;

	        while (j < arr.length) {

	            if (arr[i] > arr[j]) {
	                System.out.println("Array is Not Sorted");
	                return;
	            }

	            i++;
	            j++;
	        }

	        System.out.println("Array is Sorted");
	    }
	}