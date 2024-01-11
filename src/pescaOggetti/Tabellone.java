/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gaelb
 */
public class Tabellone {
  
    private Cella tabellone[][];
    private final int NUMERO_OGGETTI = 4;

    public Tabellone(int x, int y) {
        this.tabellone = new Cella[x][y];

    }
    
    /**
     * crea tabellone è il metodo designato alla creazione del tabellone di
     * gioco utilizza un generatore random di numeri per decidere l'oggetto da
     * inserire al suo interno, tramite uno switch composto da 4 casi (tanti
     * quanti gli oggetti).
     * Inizialmente la tabella viene riempita con elementi null per poi in 
     *seguito venir riempita con gli oggetti. Con un while, e un numero massimo
     * di oggetti, viene gestita la randomizzazione che altrimenti sarebbe stata
     * totalmente casuale.
     * 
     * @param nOggetti 
     * 
     */
    
    public void CreaTabellone(int nOggetti) {
        
        ArrayList<Oggetto> oggettiTabellone = new ArrayList<Oggetto>();
        Random r = new Random();
        int numeroGenerato;
        boolean gommaRossa = true;
        //switch per la gestione degli elementi random da mettere nella matrice
        //finchè non si raggiunge il numero max di oggetti presenti nella tab
        for (int i = 0; i < nOggetti; i++) {
            numeroGenerato = r.nextInt(NUMERO_OGGETTI);
            Oggetto o;
            switch (numeroGenerato) {
                case 0:
                    o = new Forbici("Forbice");
                    break;
                case 1:
                    o = new Gomma("Gomma", gommaRossa);
                    //così facendo gestiamo l'unica gomma rossa esistente
                    if (gommaRossa) {
                        gommaRossa = false;
                    }
                    break;
                case 2:
                    o = new Matita("Matita");
                    break;
                case 3:
                    numeroGenerato = r.nextInt(2);
                    //la penna può essere normale o stilo e l'ho gestita con una
                    //forma alternativa di "if"
                    o = new Penna("Penna", numeroGenerato == 0 ? true : false);
                    break;
                default:
                    throw new AssertionError();
            }
            oggettiTabellone.add(o);
        }
        //riempio la matrice con elementi vuoti, sostanzialmemte la "creo"
        for (int x = 0; x < tabellone.length; x++) {
            for (int y = 0; y < tabellone[x].length; y++) {
                tabellone[x][y] = new Cella(x, y, null);
            }
        }
        
        //riempio la tabella con elementi random generando numeri casuali fino
        //al raggiungimento del numero max di oggetti
        while (oggettiTabellone.size() > 0) {
            int x = r.nextInt(tabellone.length);
            int y = r.nextInt(tabellone[x].length);
            if (tabellone[x][y].getOggetto() == null) {
                tabellone[x][y].setOggetto(oggettiTabellone.remove(0));
            }

        }
    }
    
    //stampa della tabella come prova
    @Override
    public String toString() {
        String s = "";
        for (int x = 0; x < tabellone.length; x++) {
            for (int y = 0; y < tabellone[x].length; y++) {
                if (tabellone[x][y].getOggetto()!= null) {
                    s += "[" + tabellone[x][y].getOggetto().getNome().charAt(0) + "]";
                }else{
                    s += "[O}";
                }
            }
            s += "\n";
        }
        return s;
    }

}
