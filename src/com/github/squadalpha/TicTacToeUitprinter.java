package com.github.squadalpha;

import java.util.Scanner;

class TicTacToeUitprinter {

    public static void main(String[] args) {
        new TicTacToeUitprinter().run();
    }

    Scanner WelkeNummer = new Scanner(System.in);

    Integer MaxZetten = 0;
    Integer Winst1 = 0;
    Integer Winst2 = 0;

    String Linksboven = "1"; //Dit zijn alle nummers op het bord
    String Boven = "2";
    String Rechtsboven = "3";
    String LinksMidden = "4";
    String Midden = "5";
    String Rechtsmidden = "6";
    String Linksonder = "7";
    String Onder = "8";
    String Rechtsonder = "9";

    public void run() {


        while (true) {

            this.PrintBordUit();//Print het bord uit

            this.ZetInput1();//Neemt de input van Speler 1 en zet die op het bord\

            this.WinstSpeler1();

            if (Winst1 == 1) break;

            if (MaxZetten > 9) break;

            this.PrintBordUit();//Print het bord uit

            this.ZetInput2();//Neemt de input van Speler 2 en zet die op het bord

            this.WinstSpeler2();

            if (Winst2 == 1) break;

            if (MaxZetten > 9) break;

        }
        if (Winst1 == 1) System.out.println("Speler 1 heeft gewonnen");
        else if (Winst2 == 1) System.out.println("Speler 2 heeft gewonnen");
        else System.out.println("Gelijkspel");


    }

    public void PrintBordUit() {
        System.out.println(Linksboven + "|" + Boven + "|" + Rechtsboven); //Print het bord
        System.out.println("-----");
        System.out.println(LinksMidden + "|" + Midden + "|" + Rechtsmidden);
        System.out.println("-----");
        System.out.println(Linksonder + "|" + Onder + "|" + Rechtsonder);
    }

    public void ZetInput1() {
        System.out.println("Speler 1");//Moet de variable aanpassen om de move te registreren
        String ImputSpeler1 = WelkeNummer.nextLine();
        if (ImputSpeler1.equals("1")) Linksboven = ("O");
        if (ImputSpeler1.equals("2")) Boven = ("O");
        if (ImputSpeler1.equals("3")) Rechtsboven = ("O");
        if (ImputSpeler1.equals("4")) LinksMidden = ("O");
        if (ImputSpeler1.equals("5")) Midden = ("O");
        if (ImputSpeler1.equals("6")) Rechtsmidden = ("O");
        if (ImputSpeler1.equals("7")) Linksonder = ("O");
        if (ImputSpeler1.equals("8")) Onder = ("O");
        if (ImputSpeler1.equals("9")) Rechtsonder = ("O");
        ++MaxZetten;//Doet een move bij de counter
    }

    public void ZetInput2() {
        System.out.println("Speler 2");//Moet de variable aanpassen om de move te registreren
        String ImputSpeler2 = WelkeNummer.nextLine();
        if (ImputSpeler2.equals("1")) Linksboven = ("X");
        if (ImputSpeler2.equals("2")) Boven = ("X");
        if (ImputSpeler2.equals("3")) Rechtsboven = ("X");
        if (ImputSpeler2.equals("4")) LinksMidden = ("X");
        if (ImputSpeler2.equals("5")) Midden = ("X");
        if (ImputSpeler2.equals("6")) Rechtsmidden = ("X");
        if (ImputSpeler2.equals("7")) Linksonder = ("X");
        if (ImputSpeler2.equals("8")) Onder = ("X");
        if (ImputSpeler2.equals("9")) Rechtsonder = ("X");
        ++MaxZetten;//Doet een move bij de counter
    }

    public void WinstSpeler1() {
        if (Linksboven.equals("O") && (Boven.equals("O")) && (Rechtsboven.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (LinksMidden.equals("O") && (Midden.equals("O")) && (Rechtsmidden.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (Linksonder.equals("O") && (Onder.equals("O")) && (Rechtsonder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}

        if (Linksboven.equals("O") && (LinksMidden.equals("O")) && (Linksonder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (Boven.equals("O") && (Midden.equals("O")) && (Onder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (Rechtsonder.equals("O") && (Onder.equals("O")) && (Linksonder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}

        if (Linksboven.equals("O") && (Midden.equals("O")) && (Rechtsonder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (Rechtsboven.equals("O") && (Midden.equals("O")) && (Linksonder.equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
    }

    public void WinstSpeler2() {
        if (Linksboven.equals("X") && (Boven.equals("X")) && (Rechtsboven.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (LinksMidden.equals("X") && (Midden.equals("X")) && (Rechtsmidden.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (Linksonder.equals("X") && (Onder.equals("X")) && (Rechtsonder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}

        if (Linksboven.equals("X") && (LinksMidden.equals("X")) && (Linksonder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (Boven.equals("X") && (Midden.equals("X")) && (Onder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (Rechtsonder.equals("X") && (Onder.equals("X")) && (Linksonder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}

        if (Linksboven.equals("X") && (Midden.equals("X")) && (Rechtsonder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (Rechtsboven.equals("X") && (Midden.equals("X")) && (Linksonder.equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}


    }
}

