/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;

import static pescaOggetti.Partita.PENNA;

/**
 *
 * @author gaelb
 */
public class Penna extends Oggetto{
    
    private boolean isStilografica;
    
    public Penna(String nome, boolean isStilografica) {
        super(nome, isStilografica == true ? PENNA+1 : PENNA);
        this.isStilografica = isStilografica;
    }
    
    public boolean isIsStilografica() {
        return isStilografica;
    }

    public void setIsStilografica(boolean isStilografica) {
        this.isStilografica = isStilografica;
    }
                                   
    
}
