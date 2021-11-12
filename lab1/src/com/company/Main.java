package com.company;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Введите " + (i + 1) + " число: ");
            while (!(console.hasNextInt())) {
                System.out.println("Число должно быть целым и быть в пределах от " + MIN_VALUE + " до " + MAX_VALUE + "\nПовторите ввод: ");
                console.next();
            }
            a[i] = console.nextInt();
        }
        int len = a.length;
        int min = a[0];
        for (int i = 0; i < len; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Ответ: " + min);
    }
}

