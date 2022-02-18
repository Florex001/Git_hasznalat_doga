package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner konzol = new Scanner(System.in);

        System.out.print("Adj meg egy számot");
        double szam1 = konzol.nextDouble();
        System.out.print("Adj meg még egy számot");
        double szam2 = konzol.nextDouble();

        if (szam1 > szam2){
            System.out.printf("Az először megadott szám nagyobb: %.2f",szam1);
        }
        else if (szam1 < szam2){
            System.out.printf("A másodszor megadott szám nagyobb %.2f",szam2);
        }
        else {
            System.out.printf("A két szám egyenlő %.2f == %.2f", szam1, szam2);
        }
    }
}
