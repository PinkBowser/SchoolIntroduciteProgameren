package com.github.squadalpha.schoolopdrachten;
import java.util.Scanner;

class Naamvrager {

    public static void main(String[] args) {
        new Naamvrager().run();
    }
    Scanner usertekst = new Scanner(System.in);

    public void run() {

       System.out.print ("Hoe heet jij?");
        String naam = usertekst.nextLine();

        System.out.println("Welkom vandaag " + naam);

    }
    }
