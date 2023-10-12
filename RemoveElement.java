//Given an array and a value, remove all instances of that value in place and return the
//new length. (Note: The order of elements can be changed. It doesn’t matter what you
//leave beyond the new length.)
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        // Input variables
        int[] numbers = {1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7, 7, 7, 7, 99, 99};
        int target = 99;
        int length = numbers.length;
        int lengthNoDupes = numbers.length;
        
        // Reads and compares last read number
        // Copied code from DupSortArray
        System.out.println("Numeros: " + Arrays.toString(numbers));
        
        for (int i = 0; i < numbers.length; i++) {
            int readNum = numbers[i];
            if (readNum == target) {
                System.out.println("Numero repetido: " + numbers[i]);
                lengthNoDupes--;
            }
        }
        int[] result;
    }
}
