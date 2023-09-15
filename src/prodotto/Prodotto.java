/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto;

/**
 *
 * @author gael.bouche
 */
public class Prodotto {
    private double prezzo;
    private int    iva;
    private double peso;
    private double tara;
    private String descrizione;
    //private int[]  barCode;
    
    
    public Prodotto(double prezzo, double peso, double tara, String descrizione, int[] barCode) {
        this.prezzo = prezzo;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        /*
        this.barCode = new int [barCode.length];
        for(int i = 0; i<barCode.length; i++){
            barCode[i] = this.barCode[i];
        }
        */
        
    }
    
    public double prezzoIvato(){
        return prezzo + (prezzo*iva/100);
    }
    
    //public double pesoLordo(){}
    
    
    /*
    public boolean controlloCodice(){
        int somma = 0;
        int resto;
        boolean ris = false;
        
        for(int i = 0; i < barCode.length-1; i+= 2){
            somma += barCode[i]*3;
        }
        for(int i = 1; i < barCode.length-1; i+= 2){
            somma += barCode[i];
        }
        
        
    }
    
    */
    
    
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    
    
    public double getPrezzo() {
        return prezzo;
    }

    public double getPeso() {
        return peso;
    }

    public double getTara() {
        return tara;
    }

    public String getDescrizione() {
        return descrizione;
    }
    /*
    public int[] getBarCode() {
        return barCode;
    }
    */
    
    
    
    
}
