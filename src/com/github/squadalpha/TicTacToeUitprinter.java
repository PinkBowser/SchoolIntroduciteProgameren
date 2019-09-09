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

   String[] bordPlekken = new String[]{"0","1","2","3","4","5","6","7","8" };

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
        System.out.println(bordPlekken[0] + "|" + bordPlekken[1] + "|" + bordPlekken[2]); //Print het bord
        System.out.println("-----");
        System.out.println(bordPlekken[3] + "|" + bordPlekken[4] + "|" + bordPlekken[5]);
        System.out.println("-----");
        System.out.println(bordPlekken[6] + "|" + bordPlekken[7] + "|" + bordPlekken[8]);
    }

    public void ZetInput1() {
        boolean zetgoed = false;
        while(!zetgoed){
        System.out.println("Speler 1");//Moet de variable aanpassen om de move te registreren
        String ImputSpeler1 = WelkeNummer.nextLine();
        if (ImputSpeler1.equals("0") && bordPlekken[0].equals("0")) {bordPlekken[0] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("1") && bordPlekken[1].equals("1")) {bordPlekken[1] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("2") && bordPlekken[2].equals("2")) {bordPlekken[2] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("3") && bordPlekken[3].equals("3")) {bordPlekken[3] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("4") && bordPlekken[4].equals("4")) {bordPlekken[4] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("5") && bordPlekken[5].equals("5")) {bordPlekken[5] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("6") && bordPlekken[6].equals("6")) {bordPlekken[6] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("7") && bordPlekken[7].equals("7")) {bordPlekken[7] = ("O");zetgoed = true;}
        if (ImputSpeler1.equals("8") && bordPlekken[8].equals("8")) {bordPlekken[8] = ("O");zetgoed = true;}}
        ++MaxZetten;//Doet een move bij de counter
    }

    public void ZetInput2() {
        boolean zetgoed = false;
        while(!zetgoed){
        System.out.println("Speler 2");//Moet de variable aanpassen om de move te registreren
        String ImputSpeler2 = WelkeNummer.nextLine();
        if (ImputSpeler2.equals("0")&& bordPlekken[0].equals("0")) {bordPlekken[0] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("1")&& bordPlekken[1].equals("1")) {bordPlekken[1] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("2")&& bordPlekken[2].equals("2")) {bordPlekken[2] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("3")&& bordPlekken[3].equals("3")) {bordPlekken[3] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("4")&& bordPlekken[4].equals("4")) {bordPlekken[4] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("5")&& bordPlekken[5].equals("5")) {bordPlekken[5] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("6")&& bordPlekken[6].equals("6")) {bordPlekken[6] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("7")&& bordPlekken[7].equals("7")) {bordPlekken[7] = ("X");zetgoed = true;}
        if (ImputSpeler2.equals("8")&& bordPlekken[8].equals("8")) {bordPlekken[8] = ("X");zetgoed = true;}}
        ++MaxZetten;//Doet een move bij de counter
    }

    public void WinstSpeler1() {
        if (bordPlekken[0].equals("O") && (bordPlekken[1].equals("O")) && (bordPlekken[2].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (bordPlekken[3].equals("O") && (bordPlekken[4].equals("O")) && (bordPlekken[5].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (bordPlekken[6].equals("O") && (bordPlekken[7].equals("O")) && (bordPlekken[8].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}

        if (bordPlekken[0].equals("O") && (bordPlekken[3].equals("O")) && (bordPlekken[6].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (bordPlekken[1].equals("O") && (bordPlekken[4].equals("O")) && (bordPlekken[7].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (bordPlekken[8].equals("O") && (bordPlekken[7].equals("O")) && (bordPlekken[6].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}

        if (bordPlekken[0].equals("O") && (bordPlekken[4].equals("O")) && (bordPlekken[8].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
        if (bordPlekken[2].equals("O") && (bordPlekken[4].equals("O")) && (bordPlekken[6].equals("O"))) {Winst1 = 1;
        System.out.println("Winst speler 1");}
    }

    public void WinstSpeler2() {
        if (bordPlekken[0].equals("X") && (bordPlekken[1].equals("X")) && (bordPlekken[2].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (bordPlekken[3].equals("X") && (bordPlekken[4].equals("X")) && (bordPlekken[5].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (bordPlekken[6].equals("X") && (bordPlekken[7].equals("X")) && (bordPlekken[8].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}

        if (bordPlekken[0].equals("X") && (bordPlekken[3].equals("X")) && (bordPlekken[6].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (bordPlekken[1].equals("X") && (bordPlekken[4].equals("X")) && (bordPlekken[7].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (bordPlekken[8].equals("X") && (bordPlekken[7].equals("X")) && (bordPlekken[6].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}

        if (bordPlekken[0].equals("X") && (bordPlekken[4].equals("X")) && (bordPlekken[8].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}
        if (bordPlekken[2].equals("X") && (bordPlekken[4].equals("X")) && (bordPlekken[6].equals("X"))) {Winst2 = 1;
        System.out.println("Winst speler 2");}


    }
}

