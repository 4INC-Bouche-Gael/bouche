/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimof;

/**
 *
 * @author gael.bouche
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre  p = new Padre(0);
        Figlio f = new Figlio("A", 1);
        Padre pf = new Figlio("B", 2);
        Padre pp = pf; 
        
        
        /*
        System.out.println("p " + p.toString());
        System.out.println("pp " + pp.toString());
        */
        
        /*
        pp.incrementa(); // prende il metodo della classe figlio
        
        System.out.println("p " + p.toString());
        System.out.println("pp " + pp.toString());       
        */
        
        /*
        f.incrementa();
        System.out.println("f " + f.toString());
        */
        
        /*
        pf.incrementa();
        System.out.println("pf " + pf.toString());
        */
        
        
        /*        
        Figlio ff = new Figlio("C", 3);
        //ff = pp;
        ff = (Figlio) pp;//posso fare il cast perchè pp contiene un oggetto figlio
        System.out.println("ff " + ff.toString());
        */
        
        /*
        ff = (Figlio) pf;//posso fare il cast perchè pf contiene un oggetto figlio
        System.out.println("ff " + ff.toString());
        */
        
    }
    
}
