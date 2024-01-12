/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggettiModifica;

/**
 *
 * @author gael.bouche
 */
public abstract class Oggetto {
    private int punteggio;
    
    
    public Oggetto(int punteggio) {
        this.punteggio = punteggio;
    }
        
    
    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return "Oggetto{" + "punteggio=" + punteggio + '}';
    }
    
    
    
}
