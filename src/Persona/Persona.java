
package Persona;

import java.time.LocalDate;

public class Persona {
    private String nome, cognome, codFisc, dataNasc;
    private int numeroIstanze;
    
    
    public Persona(String nome, String cognome, String codFisc, String dataNasc) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFisc = codFisc;
        this.dataNasc = dataNasc;
    }
    
    public boolean verificaOmonimia(Persona persona){
        boolean ris = false;
        if(persona.getNome() == this.nome && persona.getCognome() == this.cognome){
            ris = true;
        }
        return ris;
    }
   
    /*
    public Integer calcolaEtà(){
        LocalDate dataOdierna = LocalDate.now();
        Integer anno = dataOdierna.getDayOfYear();
        
        return 
    }
    */
    
    
   

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", codFisc=" + codFisc + ", dataNasc=" + dataNasc + '}';
    }

    
    
    public Persona(Persona p) {
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setNumeroIstanze(int numeroIstanze) {
        this.numeroIstanze = numeroIstanze;
    }
    
    
    
}
