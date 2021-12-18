package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String elemnts = enterHashMap();
        HashMap<Integer, Double> hashMapOfElements = transformFromStringToHashMap(elemnts);
        System.out.println("Вы ввели: " + hashMapOfElements);
        double theBiggestNumberInCollection = hashMapOfElements.get(0);
        for (int i = 1; i < hashMapOfElements.size(); i++) {
            if (hashMapOfElements.get(i) > theBiggestNumberInCollection) {
                theBiggestNumberInCollection = hashMapOfElements.get(i);
            }
            else {
                hashMapOfElements.remove(i);
            }
        }
        System.out.println("Результат работы программы: " + hashMapOfElements);
    }

    public static String enterHashMap() {
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        int count = 0;
        String elemnts = "";
        System.out.println("Введите элементы. Как только вы введете все элементы - введите \"quit\" со следующей строки.");
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

    public static HashMap<Integer, Double> transformFromStringToHashMap(String elements) {
        String[] stringArrayOfElements = elements.split(" ");
        HashMap<Integer, Double> transformedToHashMapString = new HashMap<>();
        for (int i = 0; i < stringArrayOfElements.length; i++) {
            transformedToHashMapString.put(i, Double.parseDouble(stringArrayOfElements[i]));
        }
        return transformedToHashMapString;
    }
}
