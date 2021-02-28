package lesson23_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CinemaService cinema1 = new CinemaService();
        int input = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("1. Вывести места\n" +
                    "2. Забронировать место\n" +
                    "3. Снять бронь (пользователь вводит номер брони)\n" +
                    "4. Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    cinema1.print();
                    break;
                }
                case 2: {
                    System.out.println("Введите ряд и место:");
                    int row = scn.nextInt();
                    int place = scn.nextInt();
                    cinema1.takePlace(row, place);
                    break;
                }
                case 3: {
                    System.out.println("Введите ряд и место:");
                    int row = scn.nextInt();
                    int place = scn.nextInt();
                    cinema1.freePlace(row, place);
                    break;
                }
            }
        }
    }
}
