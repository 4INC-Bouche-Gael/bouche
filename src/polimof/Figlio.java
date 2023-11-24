/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimof;

/**
 *
 * @author gael.bouche
 */
public class Figlio extends Padre {
    private String ff;

    public Figlio(String ff, int pp) {
        super(pp);
        this.ff = ff;
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }
    @Override
    public void incrementa(){
        ff = "ho modificato il metodo del padre";
    }

    @Override
    public String toString() {
        return "Figlio{" + "ff=" + ff + '}';
    }
    
}
