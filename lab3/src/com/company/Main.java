package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите дату в формате xx/mm/yyyy, учтите, что при вводе числа или месяца от 1 до 9 необходимо написать ноль перед числом или месяцем." +
                "\ndd/mm/yyyy: ");
        Scanner console = new Scanner(System.in);
        boolean result = checkDate(console.nextLine());
        console.close();
        if (result == true) {
            System.out.println("Ваша строка имеет формат dd/mm/yyyy");
        }
        else {
            System.out.println("Ваша строка не соответсвует формату dd/mm/yyyy");
        }
    }

    public static boolean checkDate(String inputString) {
        boolean checker;
        String date = "^(0[1-9]|[12][0-9]|3[0])[-/.](0[2469]|1[1])|(0[1-9]|[12][0-9]|3[01])[-/.](0[13578]|1[02])[-/.](1[9]\\d\\d|[2-9]\\d\\d\\d)$";
        checker = inputString.matches(date);
        return checker;
    }
}
