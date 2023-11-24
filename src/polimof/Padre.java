/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimof;

/**
 *
 * @author gael.bouche
 */
public class Padre {
    
    private int pp;

    public Padre(int pp) {
        this.pp = pp;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    public void incrementa(){
        pp++;
    }

    @Override
    public String toString() {
        return "Padre{" + "pp=" + pp + '}';
    }
    
}
