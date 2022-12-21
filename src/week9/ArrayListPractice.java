package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        one();


    }

    public static void one() {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("Apple, Bananas, Pear, Grape, Orange"));

        fruits.remove(0);
        fruits.remove(fruits.size() - 1);
        System.out.println("fruits = " + fruits);

    }

}
/*

-ArrayList
.Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
        Then remove the first and last elements of the list, and then print the remaining elements to the console.
 */