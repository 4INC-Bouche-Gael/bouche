
package prod;

public class Alimentare extends Prodotto {

    private String dataScadenza;
    private int sconto;
    
    public Alimentare(String dataScadenza, String nome, String codiceAbarre, double iva, double prezzo, double tara) {
        super(nome, codiceAbarre, iva, prezzo, tara);
        this.dataScadenza = dataScadenza;
    }
  
}
