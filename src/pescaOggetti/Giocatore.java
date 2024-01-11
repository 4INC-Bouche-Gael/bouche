package pescaOggetti;

import java.util.ArrayList;

/**
 *
 * @author gaelb
 */
public class Giocatore {

    private String nome;
    private int punteggio;
    private ArrayList<Oggetto> oggettiPescati;

    public Giocatore(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = 0;
        oggettiPescati = new ArrayList<Oggetto>();

    }
    
    //metodo utilizzato dai vari oggetti per aggiungere i differenti punteggi
    public void modificaPunteggio(int punti) {
        punteggio += punti;
    }
    
    //aggiunge all'arraylist i vari oggetti pescati nel corso della partita
    public void aggiungiOggetto(Oggetto o){
        oggettiPescati.add(o);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return "Giocatore{" + "nome=" + nome + ", punteggio=" + punteggio + '}';
    }

}
