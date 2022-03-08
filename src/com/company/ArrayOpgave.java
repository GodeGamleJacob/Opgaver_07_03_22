package com.company;


public class ArrayOpgave {

    public void opgave() {

        String[] byer = {"Aalborg", "Aarhus", "Charlottenlund", "Esbjerg", "Frederiksberg", "Gentofte", "Hellerup"};

        for (int i = byer.length - 1; i >= 0; i--) {
            System.out.println("\n" + byer[i]);
        }
    }

    public static void reverseArray(int[] array, int size) {
        if (size >= 0) {
            System.out.println(array[size]);
            reverseArray(array, size - 1);
        }
    }

    public static void recursiveReverseArray(int[] intArr, int arrSize) {
        {
            for (int i = arrSize - 1; i >= 0; i--) {
                System.out.println(intArr[i]);
            }
        }

    }
}
//Udskriv et array omvendt, skrives iterativt
//Udskriv et array omvendt, skrives rekursivt