package laba2;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Prog10 {
    public static void main(String[] args) {
        Integer [] array = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        Arrays.sort(array,Collections.reverseOrder());
        for (int values : array) {
            System.out.println(values);
        }
    }
}
