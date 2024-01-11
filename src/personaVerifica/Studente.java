/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaVerifica;

import data.Data;

/**
 *
 * @author S51verifica10
 */
public class Studente extends Persona {

    private final String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private boolean isRipetente;
    private Float[] voti;

    //------------------------COSTRUTTORI--------------------------//
    public Studente() {
    }

    public Studente(Integer classe, boolean isRipetente, String nome, String cognome, Data dataDiNascita) throws Exception {
        super(nome, cognome, dataDiNascita);
        this.classe = classe;
        this.isRipetente = isRipetente;
    }

    //-------------------------METODI----------------------------//
    public boolean verificaOmonimia(Studente studente) throws Exception {
        boolean ris = false;
        if (studente.getClass() == getClass() && studente.getNome() == getNome()) {
            ris = true;
            throw new Exception("Gli studenti" + studente.getNome() + studente.getCognome()
                    + " e " + getNome() + getCognome() + "sono omonimi");
        }
        return ris;
    }

    public void aggiungiVoto(Float voto) {

    }

    public void rimuoviVoto(Integer posizione) {

    }

    public boolean promuovi() throws Exception {
        boolean ris = true;
        if (isRipetente == true) {
            isRipetente = false;
        }
        if (classe == 5) {
            ris = false;
            throw new Exception("Hai finito la scuola");
        } else {
            classe++;
        }

        return ris;
    }

    //@Overload
    public boolean promuovi(Integer numeroClassi) throws Exception {
        boolean ris = true;

        if (isRipetente == true) {
            isRipetente = false;
        }

        if (classe == 4 || classe == 5 && numeroClassi >= 2) {
            ris = false;
            throw new Exception("Hai finito la scuola!");
        } else {
            classe += numeroClassi;
        }

        return ris;
    }

    @Override
   
    public String info() throws Exception {
        String txt = "";
        if (classe != null && getNome()!= null && getCognome()!=null && getDataDiNascita()!=null) {
            txt = "COGNOME: "+ getCognome() + "\nNOME: "+ getNome() + 
                  "\nDATA DI NASCITA: " + super.getDataDiNascita().toString() + "\nRIPETENTE: "+ isRipetente;
                    //"VOTI: ["+ voti.toString()+"]"//  
        } else {
            throw new Exception("I parametri non possono essere null");
        }
        return txt ;
    }
    


//---------------------------SET-----------------------------//
public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public void setIsRipetente(boolean isRipetente) {
        this.isRipetente = isRipetente;
    }

    public void setVoti(Float[] voti) {
        this.voti = voti;
    }
    
    //---------------------------GET-----------------------------//

    public String getSCUOLA() {
        return SCUOLA;
    }

    public Integer getClasse() {
        return classe;
    }

    public boolean isIsRipetente() {
        return isRipetente;
    }

    public Float[] getVoti() {
        return voti;
    }
    
    //----------------------TO STRING------------------------//

    @Override
        public String toString() {
        return "Studente{" + "SCUOLA=" + SCUOLA + ", classe=" + classe + ", isRipetente=" + isRipetente + ", voti=" + voti + '}';
    }
    
    
    
    
}
