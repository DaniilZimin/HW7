package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //Задание 3
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(" ", "; "));


        //Задание 4
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println(fullName1);


    }
}
