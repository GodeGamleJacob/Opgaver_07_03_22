package com.company;

public class Opg4 {

/*
    public static void Opgave4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        int times = count(s, ch);
        System.out.println(ch + " appears " + times +
                (times > 1 ? " times " : " time ") + "in " + s);
    }

 */

    public static int charCount(String s, char a) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                res++;
            }
        }
        return res;
    }
}
/*
4.	Forklar følgende program, hvad gør det, og hvordan fungerer den rekursive funktion.
Skriv efterfølgende programmet hvor det løses iterativt.

import java.util.Scanner;

class Exercise18_10 {


    Programmet indfører en scanner, der tager system-inputtet.
    Programmet beder om at man skriver en string.
    Programmet lader String s være inputtet.
    Programmet beder om at man taster en char.
    Programmet lader den char ch være det næste input.
    Programmet får en int, der tager String s og char ch.
    Programmet udskriver så, hvor mange gange ch figurerer i s.

    Programmet nedenfor main hedder count.
    Programmet skal returnere en int, og det holder en string str, og en char a.
    Programmet sætter en int result til at være nul.
    Programmet kører et loop med en if, der har at string.length skal være større end 0 som sin condition.
    Programmet sætter så int result til at være lig med de indlagte conditions if den skjulte if-sætning.
    Programmet returnerer result
*/