/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe;

/**
 *
 * @author alessandro
 */
public class StudenteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studente st1=new Studente("felt","ale");
        Studente st2=new Studente("giacomoni","luca");
        Studente st3=new Studente("osati","federico");
        Studente[] studenti={st1,st2,st3};
        
        Classe inc=new Classe(st3, studenti);
        
        //System.out.println(st1.toString());
        System.out.println(inc.toString());
    }
    
}
