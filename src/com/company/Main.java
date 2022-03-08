package com.company;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Opg1 opg1 = new Opg1();
        System.out.println("Opgave1\n" + opg1.pow(2, 3));
        Opg2 opg2 = new Opg2();
        System.out.println("Opgave2\n" + opg2.fak(1000));
        Opg3 opg3 = new Opg3();
        //System.out.println("Opgave3\n" + opg3.fib(15));
        Fælleskodning fælleskodning = new Fælleskodning();
        System.out.println(fælleskodning.pow(2, 3));
        Opg4 opg4 = new Opg4();
        System.out.println("Opgave4\n" + opg4.charCount("Jacob", 'a'));
        ArrayOpgave arrayOpgave = new ArrayOpgave();
        arrayOpgave.opgave();
        Opg5 opg5 = new Opg5();



        /*int[] array{1,2,1,4,7,2}
        int antal;
        antal = (array,2,6)
         */

    }
}