/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

public class OrologioCucu extends Orologio {

    public OrologioCucu(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }

    public boolean carillon() {
        boolean var = false;

        if (getOra() == 12 && getMinuti() == 0 && getSecondi() == 0) {
            var = true;
        }

        return var;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

}
