package com.github.squadalpha;

import java.util.Scanner;

class TicTacToeUitprinter {

    public static void main(String[] args) {
        new TicTacToeUitprinter().run();
    }

    Scanner welkeNummer = new Scanner(System.in);
    Integer maxZetten = 0;
    String winst;

    String[] bordPlekken = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    public void run() {


        while (true) {

            this.printBordUit();//Print het bord uit

            this.zetInput("O");//Neemt de input van Speler 1 en zet die op het bord

            this.winstSpeler("O");

            if (winst == "O") {
                this.printBordUit();
                break;
            }

            if (maxZetten == 9) {
                this.printBordUit();
                break;
            }

            this.printBordUit();//Print het bord uit

            this.zetInput("X");//Neemt de input van Speler 2 en zet die op het bord

            this.winstSpeler("O");

            if (winst == "X") break;

        }
        if (winst == "O") System.out.println("Speler O heeft gewonnen");
        else if (winst == "X") System.out.println("Speler X heeft gewonnen");
        else System.out.println("Gelijkspel");


    }

    public void printBordUit() {
        System.out.println(bordPlekken[0] + "|" + bordPlekken[1] + "|" + bordPlekken[2]); //Print het bord
        System.out.println("-----");
        System.out.println(bordPlekken[3] + "|" + bordPlekken[4] + "|" + bordPlekken[5]);
        System.out.println("-----");
        System.out.println(bordPlekken[6] + "|" + bordPlekken[7] + "|" + bordPlekken[8]);
    }

    public void zetInput(String playerName) {
        boolean zetGoed = false;
        while (!zetGoed) {
            System.out.println("Speler " + playerName);//Moet de variable aanpassen om de move te registreren
            String ImputSpeler = welkeNummer.nextLine();
            if (ImputSpeler.equals("0") && bordPlekken[0].equals("0")) {
                bordPlekken[0] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("1") && bordPlekken[1].equals("1")) {
                bordPlekken[1] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("2") && bordPlekken[2].equals("2")) {
                bordPlekken[2] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("3") && bordPlekken[3].equals("3")) {
                bordPlekken[3] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("4") && bordPlekken[4].equals("4")) {
                bordPlekken[4] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("5") && bordPlekken[5].equals("5")) {
                bordPlekken[5] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("6") && bordPlekken[6].equals("6")) {
                bordPlekken[6] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("7") && bordPlekken[7].equals("7")) {
                bordPlekken[7] = (playerName);
                zetGoed = true;
            } else if (ImputSpeler.equals("8") && bordPlekken[8].equals("8")) {
                bordPlekken[8] = (playerName);
                zetGoed = true;
            } else System.out.println("Verkeerde move, Probeer opnieuw");
        }
        ++maxZetten;//Doet een move bij de counter
    }


    public void winstSpeler(String playerName) {
        if (bordPlekken[0].equals(playerName) && (bordPlekken[1].equals(playerName)) && (bordPlekken[2].equals(playerName))) {
            winst = playerName;
        }
        if (bordPlekken[3].equals(playerName) && (bordPlekken[4].equals(playerName)) && (bordPlekken[5].equals(playerName))) {
            winst = playerName;
        }
        if (bordPlekken[6].equals(playerName) && (bordPlekken[7].equals(playerName)) && (bordPlekken[8].equals(playerName))) {
            winst = playerName;
        }

        if (bordPlekken[0].equals(playerName) && (bordPlekken[3].equals(playerName)) && (bordPlekken[6].equals(playerName))) {
            winst = playerName;
        }
        if (bordPlekken[1].equals(playerName) && (bordPlekken[4].equals(playerName)) && (bordPlekken[7].equals(playerName))) {
            winst = playerName;
        }
        if (bordPlekken[8].equals(playerName) && (bordPlekken[7].equals(playerName)) && (bordPlekken[6].equals(playerName))) {
            winst = playerName;
        }

        if (bordPlekken[0].equals(playerName) && (bordPlekken[4].equals(playerName)) && (bordPlekken[8].equals(playerName))) {
            winst = playerName;
        }
        if (bordPlekken[2].equals(playerName) && (bordPlekken[4].equals(playerName)) && (bordPlekken[6].equals(playerName))) {
            winst = playerName;
        }
    }


}


