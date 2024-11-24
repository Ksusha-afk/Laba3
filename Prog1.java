package laba2;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();

    switch (day){
        case "Понедельник":
            System.out.println("Первый день в неделе");
        break;
        case "Вторник":
            System.out.println("Второй день в неделе");
        break;
        case "Среда":
            System.out.println("Тредий день в неделе");
        break;
        case "Четверг":
            System.out.println("Четвертый день в неделе");
        break;
        case "Пятница":
            System.out.println("Пятый день в неделе");
        break;
        case "Суббота":
            System.out.println("Шестой день в неделе");
        break;
        case "Воскресенье":
            System.out.println("Седьмой день в неделе");
        break;
        default:
            System.out.println("Такого дня недели не существует");
    }
    }
}