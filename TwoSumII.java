// Two Sum II, Input array is sorted
// This problem is similar to Two Sum.
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // Input variables
        int[] numbers = {69, 64, 1, 1, 5, 2, 7, 11, 15};

        System.out.println("Arreglo de números: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arreglo de números (Ordenado): " + Arrays.toString(numbers));
        int target = 9;

        // Output variables
        int index1 = 0;
        int index2 = 0;
        int sum = 0;

        // Loops the array with two indexes
        for (; index1 < numbers.length; index1++) {
            for (index2 = index1; index2 < numbers.length; index2++) {
                sum = numbers[index1] + numbers[index2];
                if (sum == target) {
                    System.out.println("El número objectivo se alcanza con los indices " + index1 + " y " + index2);
                    return;
                }
            }
        }
        System.out.println("El número objetivo nunca se alcanza");
    }
}
