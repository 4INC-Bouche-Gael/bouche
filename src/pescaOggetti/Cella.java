/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;

/**
 *
 * @author gaelb
 */
public class Cella {
    
    private boolean isSelezionata;
    private int x,y;
    private Oggetto oggetto;
     
    public Cella(int x, int y, Oggetto o) {
        this.isSelezionata = false;
        this.x = x;
        this.y = y;
        this.oggetto = o;
    }

    public Oggetto getOggetto() {
        return oggetto;
    }

    public void setOggetto(Oggetto oggetto) {
        this.oggetto = oggetto;
    }
    
    //quando la cella viene selezionata cambia l'attributo e restituisce 
    //l'oggetto che andrà inserito nella lista totale di oggetti pescati
    public Oggetto pescaCella(){
        isSelezionata = true;
        return oggetto;
    }
    
    public boolean isIsSelezionata() {
        return isSelezionata;
    }

    public void setIsSelezionata(boolean isSelezionata) {
        this.isSelezionata = isSelezionata;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cella{" + "isSelezionata=" + isSelezionata + ", x=" + x + ", y=" + y + '}';
    }
    
     
}
