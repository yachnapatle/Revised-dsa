package Interviewquestions;

import java.util.Scanner;

class Solution {

    public static boolean check(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                if (check(s, i, j)) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }

                }

            }

        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String s1=sc.next();
System.out.println(longestPalindrome(s1));

    }

}
