package com.company;

public class Opg2 {

    public int fak(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
/*
2.	Implementer en funktion

	public int fak(int n)

Precondition: n heltal>=0
Postcondition: Funktionen returnerer n! (n fakultet)

eks: fak(3) returnerer 6 (3*2*1)
eks: fak(5) returnerer 120  (5*4*3*2*1)
*/