import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];

       
        System.out.println("Enter " + n + " integers in ascending order:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the number you want to search: ");
        int target = scanner.nextInt();

        
        scanner.close();

        
        int result = binarySearch(array, target);

        
        if (result == -1) {
            System.out.println("Number " + target + " not found in the array.");
        } else {
            System.out.println("Number found: " + array[result]);
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            
            if (arr[mid] == target) {
                return mid;
            }

           
            if (arr[mid] < target) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
