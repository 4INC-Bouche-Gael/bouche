/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

public class Classe {
    private Studente capoclasse;
    private Studente[] studenti;

    public Classe(Studente capoclasse, Studente[] studenti) {
        this.capoclasse = capoclasse;
        this.studenti = studenti;
        
    
    }

    public Studente getCapoclasse() {
        return capoclasse;
    }

    public void setCapoclasse(Studente capoclasse) {
        this.capoclasse = capoclasse;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void invertiAttributi(){
    
    //inverte attributi??
    }
    
    public String toString(){
    String testo="";
        for (int i = 0; i < studenti.length; i++) {
            testo+=studenti[i].toString();
        }
        testo+="capo classe: \n"+capoclasse;
        
    
    return testo;}





}