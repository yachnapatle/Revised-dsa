import java.util.*;
class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        int ssum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ssum = 0;

            for (int j = i; j < arr.length; j++) {

                ssum = ssum + arr[j];

                if (ssum == s) {
                    list.add(i + 1);
                    list.add(j + 1);
                    return list;
                }

            }

        }

        return list1;

    }
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
System.out.println("enter  n");
int n=sc.nextInt();
System.out.println("enter  s");
int s=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter  elements");
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
System.out.print(subarraySum(arr,n,s));

    }
}
