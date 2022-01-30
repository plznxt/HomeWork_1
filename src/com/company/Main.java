package com.company;

public class Main {

    public static void main(String[] args) {

        String myFirstString = " Домашняя работа №1 ";
    // если честно не совсем поняла задание, но надеюсь оно верно выполнено
        int NUM = 1;
        String word = " Домашняя работа №";
        System.out.println(word + NUM);
        System.out.print(myFirstString);
        System.out.print(word);
        System.out.print(NUM);

        if (NUM < 0 )  {
            System.out.println(" Вы сохранили отрицательное число");
        } else if(NUM > 0 ) {
            System.out.println(" Вы сохранили положительное число");
        } else {
            System.out.println(" Вы сохранили нуль");
        }



    }
}
