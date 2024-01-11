/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;

import java.util.ArrayList;

/**
 *
 * @author gaelb
 */
public abstract class Oggetto {
    private String nome;
    private final int PUNTEGGIO;

    public Oggetto(String nome, int punteggio) {
        this.nome = nome;
        this.PUNTEGGIO = punteggio;
    }
    
    //metodo generico per la modifica del punteggio valido per tutte le 
    //sottoclassi tranne Forbici che viene overridato in quanto deve gestire un
    //caso specifico
    public void pescaOggetto(ArrayList<Giocatore> giocatori, int turno){
        giocatori.get(turno % giocatori.size()).modificaPunteggio(getPunteggio());
        giocatori.get(turno % giocatori.size()).aggiungiOggetto(this);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPunteggio() {
        return PUNTEGGIO;
    }
    
    @Override
    public String toString() {
        return "Oggetto{" + "nome=" + nome + ", punteggio=" + PUNTEGGIO + '}';
    }
    
    
}
