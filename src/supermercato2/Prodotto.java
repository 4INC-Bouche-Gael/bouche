
package supermercato2;

public class Prodotto {
   private double prezzo, iva, tara, peso;
   private String descrizione, barCode;

    public Prodotto(double prezzo, double iva, double tara, double peso, String descrizione, String barCode) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.tara = tara;
        this.peso = peso;
        this.descrizione = descrizione;
        this.barCode = barCode;
    }
    
    public Prodotto(Prodotto p){
        this.prezzo         = p.prezzo;
        this.iva            = p.iva;
        this.peso           = p.peso;
        this.tara           = p.tara;
        this.descrizione    = p.descrizione;
        this.barCode   = p.barCode;
    }

    public double prezzoIvato(){
        return prezzo +((prezzo*iva)/100);
    }
    /*
    public double pesoLordo(){
        
    }
    */
    
    //public boolean controlloCodice(){}
    
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    
    
    
    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public double getTara() {
        return tara;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getBarCode() {
        return barCode;
    }
   
   
   
}
