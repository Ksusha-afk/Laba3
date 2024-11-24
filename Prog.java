package laba2;

import java.util.Scanner;

public class Prog {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите день от 1 до 7: ");
            int numberOfDay = in.nextInt();

            switch (numberOfDay) {
                case 1:
                    System.out.println("Понедельник");
                break;
                case 2:
                    System.out.println("Вторник");
                break;
                case 3:
                    System.out.println("Среда");
                break;
                case 4:
                    System.out.println("Четверг");
                break;
                case 5:
                    System.out.println("Пятница");
                break;
                case 6:
                    System.out.println("Суббота");
                break;
                case 7:
                    System.out.println("Воскресенье");
                break;
                default:
                    System.out.println("Такого дня недели не существует, введите цифру от 1 до 7");

            }

        }
}
