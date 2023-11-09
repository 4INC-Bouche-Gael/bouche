
package Orologio;

public class Orologio {
    
    private int ora, minuti, secondi;

    public Orologio(int ora, int minuti, int secondi) {
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public String dammiOrario() {
        return String.format("%02d:%02d:%02d",ora, minuti, secondi);
    }

    public String toString() {
        String t = "";

        return t = "ORA: " + ora + "\nMINUTI: " + minuti + "\nSECONDI: " + secondi;

    }

}

