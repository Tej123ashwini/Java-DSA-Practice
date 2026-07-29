package placement_Preparation;

public class Maxsubarray {
                    // using kadanes alg and Time Complexity = O(n)
	    public static int maxSubArray(int[] nums) {

	        int currentSum = 0;
	        int maxSum = nums[0];

	        for (int i = 0; i < nums.length; i++) {

	            currentSum = currentSum + nums[i];

	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	            }

	            if (currentSum < 0) {
	                currentSum = 0;
	            }
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {

	        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	        System.out.println("Maximum Subarray Sum = " + maxSubArray(nums));
	    }
	}
