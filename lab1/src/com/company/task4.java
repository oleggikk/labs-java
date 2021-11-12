package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        while ((!(console.hasNextInt())))  {
            System.out.println("Число должно быть целым и быть в пределах от " + 1 + " до " + 12 + "\nПовторите ввод: ");
            console.next();
        }
        int month = console.nextInt();

        if ((month == 12) || (month == 1) || (month == 2)) {
            System.out.println("Зима");
        }
        else if ((month == 3) || (month == 4) || (month == 5)) {
            System.out.println("Весна");
        }
        else if ((month == 6) || (month == 7) || (month == 8)) {
            System.out.println("Лето");
        }
        else if ((month == 9) || (month == 10) || (month == 11)) {
            System.out.println("Осень");
        }
        else {
            System.out.println("В году 12 месяцев(1-12, ни больше, ни меньше), в следующий раз у вас обязательно получится!");
        }
    }
}