
package prod;

public class Negozio {
    
    private Prodotto[] prodotti;
    private int diml;

    public Negozio(int dimF) {
        prodotti = new Prodotto[dimF];
    
    }

    public void addProdotto(Prodotto p){
        prodotti[diml] = p;
        diml++;
    }

    @Override
    public String toString() {
        String testo = "";
        for (int i=0; i<diml; i++) {
            testo += prodotti[i].toString();
        }
       testo += " diml=" + diml;
       
       return testo;
    }
    
    
    
    
}
