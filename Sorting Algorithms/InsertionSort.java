import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------- Insertion Sort --------------------------");
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the array elements: ");
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++) {
            int num = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > num) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = num;
        }

        System.out.println("Sorted Array : ");
        for(int i = 0;i < n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

