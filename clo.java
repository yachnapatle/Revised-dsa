import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class clo{

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Define a max heap with a custom comparator that compares distances
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                // Compare based on the absolute difference from x
                int dist1 = Math.abs(p1[0] - x);
                int dist2 = Math.abs(p2[0] - x);
                // If distances are the same, compare the values themselves
                if (dist1 == dist2) {
                    return Integer.compare(p2[0], p1[0]); // Larger values are prioritized
                }
                return Integer.compare(dist2, dist1); // Max heap
            }
        });

        // Iterate through each element in the array using a standard for loop
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            maxHeap.offer(new int[]{num});
            // If heap size exceeds k, remove the farthest element
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Extract the k closest elements from the heap
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll()[0]);
        }

        // Return the result sorted to match the order in the original array
        Collections.sort(result);
      return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
      
        
        // Print the closest elements
        System.out.println(findClosestElements(arr,k,x));
    }
}