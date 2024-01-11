
package pescaOggetti;

import java.util.ArrayList;

/**
 *
 * @author gaelb
 */
public class Partita {
    
    //essendo i punti un numero fisso ho utilizzato delle variabili final 
    //nelle varie classi andrò in seguito a importre la classe Partita per 
    //ottenere queste variabili

    /**
     *
     */
    public static final int PENNA = 4;

    /**
     *
     */
    public static final int FORBICI = 1;

    /**
     *
     */
    public static final int GOMMA = 2;

    /**
     *
     */
    public static final int MALUS_PUNTI_FORBICE = -5;  

    /**
     *
     */
    public static final int MALUS_PUNTI_GOMMA = -1;

    /**
     *
     */
    public static final int MATITA = 1;
    
    private int turno, nPartiteGiocate;
    private ArrayList<Giocatore> giocatori;
    
    /**
     *
     * @param giocatori
     */
    public Partita(ArrayList<Giocatore> giocatori) {
        this.giocatori = giocatori;
        turno = 0;
    }

    /**
     *
     */
    public void iniziaPartita(){
        turno = 0;
    }
        
    /**
     *
     * @return
     */
    public int getTurno() {
        return turno;
    }

    /**
     *
     * @param turno
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     *
     * @return
     */
    public int getnPartiteGiocate() {
        return nPartiteGiocate;
    }

    /**
     *
     * @param nPartiteGiocate
     */
    public void setnPartiteGiocate(int nPartiteGiocate) {
        this.nPartiteGiocate = nPartiteGiocate;
    }
    
    
    
    
}
