package Revised_dsa;
import java.util.*;

public class BinarySearch_FirstOccurence {
    public static int lastoccurence(int arr[], int n, int k) {
        int start = 0, end = n - 1;
        int ans = -1;
    //    most remenber thing when i use this array willl be always sortefd manner
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k == arr[mid]) {
                ans = mid;
                start = mid + 1; // Move right to find last occurrence
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static int firstoccurence(int arr[], int n, int k) {
        int start = 0, end = n - 1;
        int ans = -1;
        int mid = start + (end - start) / 2;
        
        while (start <= end) {
            if (k == arr[mid]) {
                ans = mid;
                end = mid - 1; // Move left to find first occurrence
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static int totalnumberofoccurence(int arr[], int n, int k) {
        int la = lastoccurence(arr, n, k);
        int fa = firstoccurence(arr, n, k);
        if (fa == -1 || la == -1) {  // Unnecessary check for la
            return 0;
        }
        
        return (la - fa) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        System.out.println("Total occurrences: " + totalnumberofoccurence(arr, n, k));

       
    }
}
