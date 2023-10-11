//Design and implement a TwoSum class. It should support the following operations:
//add and find.
//add - Add the number to an internal data structure. find - Find if there exists any
//pair of numbers which sum is equal to the value.

import java.io.*; 
import java.lang.*; 
import java.util.*;

public class TwoSumIII {
    public static void main(String[] args) {

        // My first solution, using lists

        System.out.println("First solution, using Lists");
        DesiredClassList MySolution1 = new DesiredClassList();

        // Input variables
        // Using lists, adding is fast ( time: O(1) ) 
        // but finding is slow (time: O(n) )
        MySolution1.add(1);
        MySolution1.add(3);
        MySolution1.add(5);
        MySolution1.add(4);
        MySolution1.add(11);
        MySolution1.add(4);
        MySolution1.find(4);
        MySolution1.find(7);
        MySolution1.find(12);
        MySolution1.add(12);
        MySolution1.find(12);


        // My first solution, using lists
        System.out.println("\nSecond solution, using Hashmap");
        DesiredClassHash MySolution2 = new DesiredClassHash();

        // Input variables
        // Using hashap, note that this solution is slower because
        // the exercise asumes that numbers dont repeat
        MySolution2.add(1);
        MySolution2.add(3);
        MySolution2.add(5);
        MySolution2.add(4);
        MySolution2.add(11);
        MySolution2.add(4);
        MySolution2.find(4);
        MySolution2.find(7);
        MySolution2.find(12);
        MySolution2.add(12);
        MySolution2.find(12);
    }
}

public class DesiredClassList {
    public ArrayList<Integer> numbers;

    public DesiredClassList() {
        numbers = new ArrayList<Integer>();
    }

    public void add(int newElement) {
        numbers.add(newElement);
    }

    public void find(int targetElement) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == targetElement) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    } 
}

public class DesiredClassHash {
    public HashMap<Integer, Integer> numbers;

    public DesiredClassHash() {
        numbers = new HashMap<Integer, Integer>();
    }

    public void add(int newElement) {
        if (numbers.containsKey(newElement)) {
            numbers.put(newElement, numbers.get(newElement) + 1);
        } 
        else {
            numbers.put(newElement, 1);
        }
    }

    public void find(int targetElement) {
        for (int i : numbers.keySet()) {
            int targetVal = targetElement - i;
            if (numbers.containsKey(targetVal)) {
                continue;
            }
            System.out.println("True");
        }
        System.out.println("False");
    } 
}
