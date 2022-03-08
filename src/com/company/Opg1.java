package com.company;

public class Opg1 {

    public int pow(int x, int n) {
        int res = 1;
        for (int i = 0; i <= n; i++) {
            res *= x;
        }
        return res;
    }
}
/*
1.	Implementer en funktion

public int pow(int x, int n)

Precondition: x positivt heltal, n heltal>=0
Postcondition: Funktionen returnerer x opløftet til n’te

eks: pow(2,3) returnerer 8
*/