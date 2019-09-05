package com.github.squadalpha;

import java.util.Scanner;

class TicTacToeUitprinter {

    public static void main(String[] args) {
        new TicTacToeUitprinter().run();
    }

    Scanner WelkeNummer = new Scanner(System.in);

    Integer MaxZetten = 0;

    String Linksboven = "1"; //Dit zet alle nummers op het bord
    String Boven = "2";
    String Rechtsboven = "3";
    String LinksMidden = "4";
    String Midden = "5";
    String Rechtsmidden = "6";
    String Linksonder = "7";
    String onder = "8";

    String Rechtsonder = "9";
    public void run() {



        while (true) {

            this.PrintBordUit();//Print het bord uit

            this.ZetInput1();//Neemt de input van Speler 1 en zet die op het bord

            if (MaxZetten > 9) break;

            this.PrintBordUit();//Print het bord uit

            this.ZetInput2();//Neemt de input van Speler 2 en zet die op het bord

            if (MaxZetten > 9) break;

        }

        }

    public void PrintBordUit() {
        System.out.println(Linksboven + "|" + Boven + "|" + Rechtsboven); //Print het bord
        System.out.println("-----");
        System.out.println(LinksMidden + "|" + Midden + "|" + Rechtsmidden);
        System.out.println("-----");
        System.out.println(Linksonder + "|" + onder + "|" + Rechtsonder);
    }

    public void ZetInput1(){
            System.out.println("Speler 1");//Moet de variable aanpassen om de move te registreren
            String ImputSpeler1 = WelkeNummer.nextLine();
            if (ImputSpeler1.equals("1")) Linksboven = ("O");
            if (ImputSpeler1.equals("2")) Boven = ("O");
            if (ImputSpeler1.equals("3")) Rechtsboven = ("O");
            if (ImputSpeler1.equals("4")) LinksMidden = ("O");
            if (ImputSpeler1.equals("5")) Midden = ("O");
            if (ImputSpeler1.equals("6")) Rechtsmidden = ("O");
            if (ImputSpeler1.equals("7")) Linksonder = ("O");
            if (ImputSpeler1.equals("8")) onder = ("O");
            if (ImputSpeler1.equals("9")) Rechtsonder = ("O");
        ++MaxZetten;//Doet een move bij de counter
    }
    public void ZetInput2(){
        System.out.println("Speler 1");//Moet de variable aanpassen om de move te registreren
        String ImputSpeler2 = WelkeNummer.nextLine();
        if (ImputSpeler2.equals("1")) Linksboven = ("X");
        if (ImputSpeler2.equals("2")) Boven = ("X");
        if (ImputSpeler2.equals("3")) Rechtsboven = ("X");
        if (ImputSpeler2.equals("4")) LinksMidden = ("X");
        if (ImputSpeler2.equals("5")) Midden = ("X");
        if (ImputSpeler2.equals("6")) Rechtsmidden = ("X");
        if (ImputSpeler2.equals("7")) Linksonder = ("X");
        if (ImputSpeler2.equals("8")) onder = ("X");
        if (ImputSpeler2.equals("9")) Rechtsonder = ("X");
        ++MaxZetten;//Doet een move bij de counter
    }
    }

