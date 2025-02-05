package Revised_dsa;

import java.util.*;
public class subArrayForce {
    public static void subarray(int arr[], int n) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
          int start = i;
            for (int j = i + 1; j < n; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += arr[k];
                }
                System.out.println(curr);
                if (max < curr) {
                    max = curr;
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subarray(arr, n);
    }

}
