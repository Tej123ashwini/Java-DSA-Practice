package placement_Preparation;


import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public int[] intersectionArrays(int[] arr1, int[] arr2) {
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for(int arr : arr1) {
			set1.add(arr);
		}
		for(int arr : arr2) {							//using for each-loop check arrr2 elements
			if(set1.contains(arr)) {
				result.add(arr);
			}
		}
		int[] answer = new int[result.size()];			//converting hashset into array
		int i =0;
		for(int arr : result) {
			answer[i] = arr;
			i++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		
		IntersectionOfTwoArrays  obj = new IntersectionOfTwoArrays();
		int[] result = obj.intersectionArrays(arr1,arr2);
		
		for(int arr : result) {
			System.out.println("[" + arr + "]");
		}

	}

}
