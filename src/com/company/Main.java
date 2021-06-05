package com.company;

public class Main {

    public static void main(String[] args) {
        String esenalievNurbek;
        final int NUM = 6;
        String word = " привет";
        esenalievNurbek = NUM + word;
        System.out.println(esenalievNurbek);
        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        }
        else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("вы сохранили нуль");
        }
    }


}

