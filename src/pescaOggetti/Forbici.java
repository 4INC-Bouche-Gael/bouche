/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti;
import java.util.ArrayList;


import static pescaOggetti.Partita.FORBICI;
import static pescaOggetti.Partita.MALUS_PUNTI_FORBICE;

/**
 *
 * @author gaelb
 */
public class Forbici extends Oggetto{
       
    public Forbici(String nome) {
        super(nome, FORBICI);
    }
    //metodo della classe oggetto che viene sovrascritto in quanto deve gestire 
    //una funzionalità diversa (toglie 5 punti a tutti i giocatori)
    @Override
    public void pescaOggetto(ArrayList<Giocatore> arrayGiocatori, int turno){
        arrayGiocatori.get(turno% arrayGiocatori.size()).modificaPunteggio(getPunteggio());
        arrayGiocatori.get(turno% arrayGiocatori.size()).aggiungiOggetto(this);
        for(int i = 0; i < arrayGiocatori.size(); i++){
            if(i != (turno%arrayGiocatori.size())){
                arrayGiocatori.get(i).modificaPunteggio(MALUS_PUNTI_FORBICE);
            }
        }
    }
    
}
