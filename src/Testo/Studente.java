/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author alessandro
 */
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
