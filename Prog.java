package laba2;

import java.util.Scanner;

public class Prog {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("������� ���� �� 1 �� 7: ");
            int numberOfDay = in.nextInt();

            switch (numberOfDay) {
                case 1:
                    System.out.println("�����������");
                break;
                case 2:
                    System.out.println("�������");
                break;
                case 3:
                    System.out.println("�����");
                break;
                case 4:
                    System.out.println("�������");
                break;
                case 5:
                    System.out.println("�������");
                break;
                case 6:
                    System.out.println("�������");
                break;
                case 7:
                    System.out.println("�����������");
                break;
                default:
                    System.out.println("������ ��� ������ �� ����������, ������� ����� �� 1 �� 7");

            }

        }
}
