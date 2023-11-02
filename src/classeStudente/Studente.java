
package classeStudente;

public class Studente {
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public Studente(Studente studente) {
        this.cognome = studente.getCognome();
        this.nome = studente.getNome();        
    }
    
    public String toString(){
    
    return "cognome: "+cognome+"\nnome: "+nome+"\n\n";
    }

    
   
      
    
}
