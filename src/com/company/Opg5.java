package com.company;

public class Opg5 {

    public static int countArray(int[] arr, int n, int l) {
        int result = 0;
        if (l > 0) {
            result = countArray(arr, n, l - 1) + ((arr[l - 1] == n) ? 1 : 0);
        }
        return result;
    }

    public static int arrayCount(int[] array, int num, int ll) {
        int res = 0;
        for (int i = 0; i < ll; i++) {
            if (array[i] == num)
                res++;
        }
        return res;
    }

}
//5.	Skriv et program, som tæller antal gange et givet heltal forekommer i et array af integers. Programmet skal benytte en rekursiv funktion.