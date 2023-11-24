
package prod;

public class NonAlimentare extends Prodotto {
    
    private boolean hasPlastic;

    public NonAlimentare(boolean hasPlastic, String nome, String codiceAbarre, double iva, double prezzo, double tara) {
        super(nome, codiceAbarre, iva, prezzo, tara);
    }
    
    @Override
    public String toString() {
        return "NonAlimentare{" + "hasPlastic=" + hasPlastic + '}';
    }
    
    
    
}
