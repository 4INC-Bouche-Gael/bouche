/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;

import java.util.ArrayList;
import static pescaOggetti.Partita.*; //importo tutte le variabili statiche

/**
 *
 * @author gaelb
 */
public class Gomma extends Oggetto{
    
    private boolean isRossa;
    
    public Gomma(String nome, boolean isRossa) {
       super(nome, isRossa == true ? MALUS_PUNTI_GOMMA : GOMMA);
    }
    
    public boolean isIsRossa() {
        return isRossa;
    }

    public void setIsRossa(boolean isRossa) {
        this.isRossa = isRossa;
    }

    @Override
    public String toString() {
        return "Gomma{" + "isRossa=" + isRossa + '}';
    }

    
}
