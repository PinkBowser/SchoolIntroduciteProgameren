package com.github.squadalpha.schoolopdrachten;
import java.util.Scanner;

class DagVrager {

    public static void main(String[] args) {
        new DagVrager().run();
    }

    Scanner userdag = new Scanner(System.in);

    public void run() {
        System.out.println("Welke dag is het vandaag? ");
        String welkedag = userdag.nextLine();

        if (welkedag.equals("Maandag")) System.out.println("Garfield haat maandag");
        if (welkedag.equals("Dinsdag")) System.out.println("Garfield houdt van disdag want dat krijgt hij eten");
        if (welkedag.equals("Woensdag")) System.out.println("Garfield haat woensdag want dan moet hij naar de kapper");
        if (welkedag.equals("Donderdag")) System.out.println("Garfield houdt van donderdag want het klinkt als dinsdag");
        if (welkedag.equals("Vrijdag")) System.out.println("Garfield houdt van vrijdag want dan is Jon klaar met werken");
        if (welkedag.equals("Zaterdag")) System.out.println("Garfield houdt van zaterdag want dan gaan ze naar de boederij");
        if (welkedag.equals("Zondag")) System.out.println("Garfield houdt van zondag want dan doet Jon helemaal niets");





    }
}