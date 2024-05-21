package cz.itnetwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * rozhraní pro komunikaci s uživatelem
 */
public class UzivatelskeRozhrani {

    /**
     * databáze
     */
    private DatabazePojistencu databazePojistencu;
    /**
     * scanner
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * konstruktor
     */
    public UzivatelskeRozhrani() {
        databazePojistencu = new DatabazePojistencu();
    }

    /**
     * přidá pojištěnce do databáze
     */
    public void pridejPojistence() {
        System.out.println("Zadejte jméno pojistěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte věk");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonní číslo:");
        String telefon = scanner.nextLine();
        databazePojistencu.pridejPojistence(jmeno, prijmeni, vek, telefon);
        System.out.println();
        if (jmeno.isEmpty() || prijmeni.isEmpty()) {
            System.out.println("Jméno nebo příjmení nebylo zadáno. Pokračujte klávesou ENTER...");
            scanner.nextLine();
            System.out.println();
        } else {
            System.out.println("Data byla uložena. Pokračujte klávesou ENTER...");
            scanner.nextLine();
            System.out.println();
        }
    }

    /**
     * vypíše všechny pojištěnce
     */
    public void vypisPojistence() {
        ArrayList<Pojistenec> pojistenci = databazePojistencu.vypisPojistence();
        if (pojistenci.size() > 0) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
        System.out.println();
        System.out.println("Pokračujte klávesou ENTER......");
        scanner.nextLine();
        System.out.println();
    }

    /**
     * najde pojištěnce podle jména a příjmení
     */
    public void najdiPojistence() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine();
        ArrayList<Pojistenec> pojistenci = databazePojistencu.najdiPojistence(jmeno, prijmeni, true);
        if (pojistenci.size() > 0) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
        System.out.println();
        System.out.println("Pokračujte klávesou ENTER...");
        scanner.nextLine();
        System.out.println();
    }

    /**
     * vypíše úvodní obrazovku
     */
    public void vypisUvodniObrazovku() {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------");
    }
}

