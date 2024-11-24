package laba2;
import java.util.Scanner;
import java.util.Arrays;

public class Prog7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        char[] array1 = new char[10];
        int a = 1;
        for (char i = 'a'; i <= 's'; i += 2) {
            array1[a] = i;
            a = a++;
            System.out.println("Массив в прямом порядке: " + array1[a]);
        }
        for (char i = 's'; i >= 'a'; i -= 2) {
            array1[a] = i;
            a = a--;
            System.out.println("Массив в обратном порядке: " + array1[a]);
        }
        char [] array2 = new char [10];


    }
}
