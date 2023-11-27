/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persona;

/**
 *
 * @author gaelb
 */
public class PersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona("Gael", "Bouche", "BCHGLA06D09L378E", "09/04/2006");
        Persona persona2 = new Persona("Charlyne", "Bouche", "CHARLY03N29378E", "29/12/2003");
        //--------------------------------------------------------------------------------------------------------------//
        System.out.println(persona.verificaOmonimia(persona2));    
        System.out.println(persona.toString());
        
    }
            

}
