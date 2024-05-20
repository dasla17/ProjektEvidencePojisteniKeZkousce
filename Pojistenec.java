package cz.itnetwork;

/**
 * pojištěnec
 */
public class Pojistenec {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    /**
     * konstruktor
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefon
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.setJmeno(jmeno);
        this.setPrijmeni(prijmeni);
        this.setVek(vek);
        this.setTelefon(telefon);
    }

    /**
     * vrátí jméno
     * @return
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * nastaví jméno
     * @param jmeno
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * vrátí příjmení
     * @return
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * nastaví příjmení
     * @param prijmeni
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**vrátí věk
     *
     * @return
     */
    public int getVek() {
        return vek;
    }

    /**
     * nastaví věk
     * @param vek
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * vrátí telefon
     * @return
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * nastaví telefon
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * vrátí textovou reprezentaci instance
     * @return
     */
    @Override
    public String toString() {
        return getJmeno() + "  " + getPrijmeni() + "  " + getVek() + "   " + getTelefon();
    }
}
