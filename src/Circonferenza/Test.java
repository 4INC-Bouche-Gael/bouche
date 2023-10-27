/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Circonferenza;

/**
 *
 * @author gaelb
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circonferenza c1 = new Circonferenza(0, 0, 7, 12);
        
        System.out.println(c1.getPerimetro()+" cm");
        System.out.println(c1.getArea()+" cm^2");
        System.out.println(c1.calcoloRaggio()+" cm");
    }
    
}
