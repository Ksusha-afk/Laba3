package laba2;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        while (true) {
            try {
                int size = Integer.parseInt(id.nextLine());
                int[] array = new int[size];
                int a = 1;
                System.out.println("Размер массива равен: " + size);
                for (int i = 0; i < array.length; i++) {

                    if (i % 5 == 2) {
                        array[a] = i;
                        System.out.println(array[a]);
                        a = a + 1;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод данных " + e.getMessage());
            }
        }
    }
}
