package laba2;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("������� �������� ��� ������: ");
        String day = in.nextLine();

    switch (day){
        case "�����������":
            System.out.println("������ ���� � ������");
        break;
        case "�������":
            System.out.println("������ ���� � ������");
        break;
        case "�����":
            System.out.println("������ ���� � ������");
        break;
        case "�������":
            System.out.println("��������� ���� � ������");
        break;
        case "�������":
            System.out.println("����� ���� � ������");
        break;
        case "�������":
            System.out.println("������ ���� � ������");
        break;
        case "�����������":
            System.out.println("������� ���� � ������");
        break;
        default:
            System.out.println("������ ��� ������ �� ����������");
    }
    }
}