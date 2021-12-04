package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String elemnts = enterArray();
        double[] doubleArray = transformArrayFromStringToDouble(elemnts);
        System.out.println(Arrays.toString(doubleArray));
        double theBiggestNumberInArrayBeforeIPlusOne = Double.MIN_VALUE;
        elemnts = "";
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > theBiggestNumberInArrayBeforeIPlusOne) {
                theBiggestNumberInArrayBeforeIPlusOne = doubleArray[i];
                elemnts = elemnts + doubleArray[i] + " ";
            }
        }
        double[] doubleArrayResult = transformArrayFromStringToDouble(elemnts);
        System.out.println(Arrays.toString(doubleArrayResult));
    }

    public static String enterArray() {
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        int count = 0;
        String elemnts = "";
        System.out.println("Введите элементы массива, каждый с новой строки. Как только вы введете все элементы - введите \"quit\".");
        while (true) {
            if (console.hasNextDouble()) {
                count++;
                elemnts = elemnts + console.nextLine() + " ";
            }
            else {
                if (console.nextLine().equals("quit")) {
                    console.close();
                    break;
                }
                else {
                    System.out.println("Вы ввели не числовое значение, повторите ввод текущего элемента или напишите \"quit\"," +
                            " если хотете прекратить ввод элементов: ");
                }
            }
        }
        return elemnts;
    }

    public static double[] transformArrayFromStringToDouble(String elements) {
        int count = 0;
        for (int i = 0; i < elements.length(); i++) {
            if (elements.charAt(i) == ' ') {
                count++;
            }
        }
        String[] stringArrayOfElements = elements.split(" ");
        double[] Array = new double[count];
        for (int i = 0; i < count; i++) {
            Array[i] = Double.parseDouble(stringArrayOfElements[i]);
        }
        return Array;
    }
}