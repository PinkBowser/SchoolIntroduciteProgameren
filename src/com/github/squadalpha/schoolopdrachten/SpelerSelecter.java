package com.github.squadalpha.schoolopdrachten;

import java.util.Scanner;

public class SpelerSelecter {


    public static void main(String[] args) {
        new SpelerSelecter().run();
    }
    Scanner imputNaam = new Scanner(System.in);
    String[] spelernaam = new String[]{"0", "1", "2"};

    private void run() {
            System.out.print("Wat is de naam van de eerste speler?");
            spelernaam[0] = imputNaam.nextLine();
            System.out.print("Wat is de naam van de tweede speler?");
            spelernaam[1] = imputNaam.nextLine();
            System.out.print("Wat is de naam van de derde speler?");
            spelernaam[2] = imputNaam.nextLine();

            Integer welkeSpeler = (int) (Math.random() * 3 + 1);

            if (welkeSpeler == 1) System.out.println(spelernaam[0] + " mag eerst");
            if (welkeSpeler == 2) System.out.println(spelernaam[1] + " mag eerst");
            if (welkeSpeler == 3) System.out.println(spelernaam[2] + " mag eerst");


    }

}
