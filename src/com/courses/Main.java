package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Введие сумму покупки: ");
        sum = in.nextDouble();

        if (sum >= 500 & sum < 1000) {
            System.out.println("Скидка 3%");
            sum = sum * 0.97;
            System.out.println("Заплатите - " + sum);
        } else if (sum >= 1000) {
            System.out.println("Скида 5%");
            sum = sum * 0.95;
            System.out.println("Заплатите - " + sum);
        } else {
            System.out.println("Вы ненабрали не сумму необходимую для скидки!\n Сума покупки - " + sum);
        }
    }
}
