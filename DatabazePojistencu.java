package cz.itnetwork;

import java.util.ArrayList;

/**
 * vytvoření databáze
 */

public class DatabazePojistencu {

    /**
     * záznamy pojištěnců
     */
    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();

    /**
     * přidá pojištěnce do databáze
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefon
     */
    public void pridejPojistence(String jmeno, String prijmeni, int vek, String telefon) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
    }

    /**
     * vypíše všechny pojištěnce
     * @return
     */
    public ArrayList<Pojistenec> vypisPojistence() {
        ArrayList<Pojistenec> vypsane = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            vypsane.add(pojistenec);
        }
        return vypsane;
    }

    /**
     * najde pojištěnce podle jména a příjmení
     * @param jmeno
     * @param prijmeni
     * @param dleJmenaPrijmeni
     * @return
     */
    public ArrayList<Pojistenec> najdiPojistence(String jmeno, String prijmeni, boolean dleJmenaPrijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if (dleJmenaPrijmeni && pojistenec.getJmeno().contains(jmeno) && pojistenec.getPrijmeni().contains(prijmeni)) {
                nalezene.add(pojistenec);
            }
        }
        return nalezene;
    }
}

