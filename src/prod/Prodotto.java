
package prod;

public class Prodotto {
    
    private String nome, codiceAbarre;
    private double iva, prezzo, tara;

    public Prodotto(String nome, String codiceAbarre, double iva, double prezzo, double tara) {
        this.nome = nome;
        this.codiceAbarre = codiceAbarre;
        this.iva = iva;
        this.prezzo = prezzo;
        this.tara = tara;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceAbarre() {
        return codiceAbarre;
    }

    public void setCodiceAbarre(String codiceAbarre) {
        this.codiceAbarre = codiceAbarre;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "nome=" + nome + ", codiceAbarre=" + codiceAbarre + ", iva=" + iva + ", prezzo=" + prezzo + ", tara=" + tara + '}';
    }
    
    
    
    
}
