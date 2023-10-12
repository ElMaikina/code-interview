//Given an array and a value, remove all instances of that value in place and return the
//new length. (Note: The order of elements can be changed. It doesn’t matter what you
//leave beyond the new length.)
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        // Input variables
        int[] numbers = {0, 0, 1, 1, 2, 3, 4, 0, 4, 4, 0, 4, 5, 6, 7, 0, 7, 7, 7, 7, 99, 99};
        int length = numbers.length;
        int zeroesFound = 0;
        
        // Reads and compares last read number
        // Copied code from DupSortArray
        System.out.println("Numeros: " + Arrays.toString(numbers));
        
        // Counts all the zeroes
        for (int i = 0; i < numbers.length; i++) {
            int readNum = numbers[i];
            if (readNum == 0) {
                zeroesFound++;
            }
        }
        
        // Length of array if it had no zeroes
        int newLength = length - zeroesFound;
        int[] result = new int[length];
        int i = 0;
        int j = 0;

        // Reads all numbers and insert non-zeroes to free
        // positions
        while (i < length) {
            int readNum = numbers[i];
            if (readNum != 0) {
                result[j] = numbers[i];
                j++;
            } 
            i++;
        }

        // Add zeroes to the end of the array
        while (j < length) {
            result[j] = 0;
            j++;
        }
        System.out.println("Resultado: " + Arrays.toString(result));
    }
}
