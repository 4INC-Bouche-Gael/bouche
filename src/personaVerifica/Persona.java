/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaVerifica;

import data.Data;
import java.io.IOException;

/**
 *
 * @author S51verifica10
 */
public class Persona {
   private String nome, cognome;
   private Data   dataDiNascita;
   protected int numeroIstanze;

   //------------------------COSTRUTTORI--------------------------//
    public Persona() {
    }

    public Persona(String nome, String cognome, Data dataDiNascita) throws Exception {
        setNome(nome);
        setCognome(cognome);
        this.dataDiNascita = dataDiNascita;
    }
    
    //-------------------------METODI----------------------------//
    
    public boolean verificaOmonimia(Persona persona)throws Exception{
        boolean ris = false;
        if(persona.getNome()== getNome()&& persona.getCognome()== getCognome()){
            ris = true;
            throw new IOException("Le persone sono omonime");
        }
        return ris;
    }
    /*
    public Integer calcolaEta() throws Exception{
        Data dataOggi = new Data();
        Data dataPersona = dataDiNascita;
        return Data.differenzaInAnni(dataPersona, dataOggi);
    }
    */
    
    
    public String info()throws Exception{
        String txt = "";
        if(nome!= null && cognome!=null && dataDiNascita!=null){
            txt = "COGNOME: "+ getCognome() + "\nNOME: "+ getNome() + 
                  "\nDATA DI NASCITA: " + dataDiNascita.toString();
        }else{
            throw new Exception("I parametri non possono essere null");
        }
        
        return txt;
    }
    
    private void controlloNominativi(String nominativo)throws Exception{
        if(nominativo.charAt(0)<65 && nominativo.charAt(0)>90){
            throw new IOException("La prima lettera deve essere maiuscola!");
        }
        for(int i = 1; i < nominativo.length(); i++){
            if(nominativo.charAt(i)<97 && nominativo.charAt(i)>122){
                throw new IOException("Deve contenere solo lettere minuscole!");
            }
        }
    }
    
    //---------------------------SET-----------------------------//
    
    public void setNome(String nome) throws Exception {
        controlloNominativi(nome);
        this.nome = nome;
    }

    public void setCognome(String cognome) throws Exception {
        controlloNominativi(cognome);
        this.cognome = cognome;
    }

    public void setDataDiNascita(Data dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    
    //---------------------------GET-----------------------------//
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public int getNumeroIstanze() {
        return numeroIstanze;
    }

    //----------------------TO STRING------------------------//
   
    @Override
    public String toString() {
        return "Persona{" + "nome=" + getNome() + ", cognome=" + getCognome() + ", dataDiNascita=" + dataDiNascita.toString() + '}';
    }
    
    
   
   
}
