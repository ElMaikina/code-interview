// Two Sum II, Input array is sorted
// This problem is similar to Two Sum.
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // Input variables
        int[] numbers = {1, 3, 1, 4, 99, 64, 12, 12, 2, 7, 11, 15};
        int target = 24;

        System.out.println("Arreglo de números: " + Arrays.toString(numbers));
        System.out.println("Número objetivo: " + target);

        // Output variables
        int index1 = 0;
        int index2 = 0;
        int sum = 0;

        // First solution using two loops
        System.out.println("\nResolución (usando dos ciclos)\n");
                
        for (; index1 < numbers.length; index1++) {
            for (index2 = index1 + 1; index2 < numbers.length; index2++) {
                sum = numbers[index1] + numbers[index2];
                System.out.println("    Primer número: " + numbers[index1] + ", Segundo número: " + numbers[index2] + ", Suma = " + sum);
                if (sum == target) {
                    System.out.println("\nEl número objectivo se alcanza con los indices " + index1 + " y " + index2);
                    index1 = numbers.length;
                    index2 = numbers.length;
                    break;
                }
            }
        }

        // Second solution using HashMap
        System.out.println("\nResolución (usando Hashmap)\n");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
                
        for (index1 = 0; index1 < numbers.length; index1++) {
            System.out.print("Número leído: " + numbers[index1] + ", Índice: " + index1 + " ");
            if (map.containsKey(numbers[index1])) {
                int index = map.get(numbers[index1]);
                result[0] = index;
                result[1] = index1;
                System.out.println("\n\nEl número objectivo se alcanza con los indices " + result[0] + " y " + result[1]);
                break;
            }
            else {
                map.put(target - numbers[index1], index1);
                System.out.println("(Se agregó al HashMap: " + (target - numbers[index1]) + ", " + index1 + ")");
            }
        }
    }
}
