// Given an array of n positive integers and a positive integer s, find the minimal length
// of a subarray of which the sum ≥ s. If there isn’t one, return 0 instead.
// For example, given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has the minimal
// length of 2 under the problem constraint
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class MinSizeSum {
    public static void main(String[] args) {
        // Input variables
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        int targetSum = 7;
        int sum = 0;

        // My solution consist of reading the array from the biggest
        // element to the smallest. This way, it is faster to find the
        // smallest subarray since the Sum grows as fast as it can.
        System.out.println("Numeros (No Ordenados): " + Arrays.toString(numbers.toArray()));
        Collections.sort(numbers);
        System.out.println("Numeros (Ordenados): " + Arrays.toString(numbers.toArray()));

        for (int i = numbers.size() - 1; i > 0 ; i--) {
            sum += numbers.get(i);
            if (sum >= targetSum) {
                System.out.println("Largo minimo: " + (numbers.size() - i));
                return;
            }
        }
    }
}
