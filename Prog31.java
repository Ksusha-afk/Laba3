package laba2;

import java.util.Scanner;

public class Prog31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите количество чисел в последовательности: ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=1; i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
