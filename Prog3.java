package laba2;
import java.util.Scanner;
import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = in.nextInt();
        int array[] = new int [n];
        array[0]=0;
        array[1]=1;
            for(int i = 2; i<array.length; ++i) {
            array[i]=array[i-1]+array[i-2];
        System.out.println("Последовательность Фиббаначи из " +n+ " чисел:" +array[i]);
            }

        }

    }
