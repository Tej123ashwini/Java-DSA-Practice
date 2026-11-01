import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------- Selection Sort --------------------------");
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the array elements: ");
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for(int i = 0;i < n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
