package laba2;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите количество чисел дл€ складывани€: ");
        int x = in.nextInt();

        int[] array = new int [30];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        int[] array1 = new int [x];

        int y = 0;
        int a = 1;

        while (y<x){
            int c = array[a]%5;
            int e = array[a]%3;

            if (c == 2 && e == 1) {
                y=y+1;
                array1[y]=array[a];
                a=a+1;
            }
        int sum = 0;
        for (int i = 1; i<x; i++) {
            sum = array1[i]+array1[i+1];
            System.out.println(array1[i]);
        }
        System.out.println(sum);

        }
    }
}
