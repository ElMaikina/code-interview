// Given a sorted array, remove the duplicates in place such that each element appear
// only once and return the new length. Do not allocate extra space for another array,
// you must do this in place with constant memory.
// For example, given input array A = [1,1,2], your function should return length = 2,
// and A is now [1,2].
import java.io.*; 
import java.lang.*; 
import java.util.*;

public class DupSortArray {
    public static void main(String[] args) {
        // Input variables
        int[] numbers = {1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7, 7, 7, 7};
        int length = numbers.length;
        int lengthNoDupes = numbers.length;
        int lastReadNum = -1;

        // Reads and compares last read number
        System.out.println("Numeros: " + Arrays.toString(numbers));
        
        for (int i = 0; i < numbers.length; i++) {
            int readNum = numbers[i];
            if (readNum == lastReadNum) {
                System.out.println("Numero repetido: " + numbers[i]);
                lengthNoDupes--;
            }
            lastReadNum = numbers[i];
        }
        System.out.println("Numeros diferentes: " + lengthNoDupes);
    }
}
