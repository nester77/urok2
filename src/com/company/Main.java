package com.company;

public class Main {

    public static void main(String[] args) {
        // Нестерович Алексей 02.04.1977
        int yearOfBirthday = 1977;
        int monthOfBirthday = 4;
        int dayOfBirthday = 2;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);
        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        char[] name = new char[7];
        name[0] = 'А';
        name[1] = 'л';
        name[2] = 'е';
        name[3] = 'к';
        name[4] = 'с';
        name[5] = 'е';
        name[6] = 'й';
        System.out.print("Массив с моим именем: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(name[i]);
        }
        System.out.println(" ");
        double myAge = 43;
        double partYear = 6.0 / 12.0;
        System.out.println("Мне " + (myAge + partYear) + " лет");
    }
}
