package cz.itnetwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UzivatelskeRozhrani uzivatelskeRozhrani = new UzivatelskeRozhrani();
        String volba = "";

        //hlavní cyklus
        while (!volba.equals("4")) {
            uzivatelskeRozhrani.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            System.out.println();

            //reakce na volbu
            switch (volba) {
                case "1":
                    uzivatelskeRozhrani.pridejPojistence();
                    break;
                case "2":
                    uzivatelskeRozhrani.vypisPojistence();
                    break;
                case "3":
                    uzivatelskeRozhrani.najdiPojistence();
                    break;
                case "4":
                    // vyskočí z cyklu a ukončí program
                    break;
                default:
                    System.out.println("Neplatná volba, opakujte prosím volbu.");
            }

        }




    }
}
