package laba2;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Prog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ����� 1: ");
        int x = in.nextInt();
        System.out.println("������� ����� ����� 2: ");
        int y = in.nextInt();
        IntStream stream = IntStream.rangeClosed(x, y);
        stream.forEach(System.out::println);

        }

    }
