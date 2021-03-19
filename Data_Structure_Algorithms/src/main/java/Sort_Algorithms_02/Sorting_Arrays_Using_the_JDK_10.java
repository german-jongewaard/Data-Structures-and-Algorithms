/*
 * Sorting Arrays Using the JDK
 *
 * by Germán Jongewaard
 *
 */
package Sort_Algorithms_02;

import java.util.Arrays;

/**
 *
 * @author Germán Jongewaard
 */
public class Sorting_Arrays_Using_the_JDK_10 {
    
 public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
