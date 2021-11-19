package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        System.out.print("Введите число, для которого хотите посчитать факториал: ");
        while (true) {
            if (console.hasNextInt()) {
                n = console.nextInt();
                if (n < 15 && n >= 0) {
                    break;
                }
                else {
                    System.out.print("По условию задачи число должно быть строго меньше 15 и " +
                            "неотрицательным. \nВы пытаетесь пытаетесь пойти против условий задачи! Повторите ввод: ");
                }
            }
            else {
                console.next();
                System.out.print("Вы ввели не целочисленное значение или вовсе не число, а зря...\n" +
                        "Вы можете всё исправить! Повторите попытку: ");
            }
        }
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }
        System.out.println("Ответ: " + result);
    }
}
