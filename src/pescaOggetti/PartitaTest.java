/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pescaOggetti;

/**
 *
 * @author gaelb
 */
public class PartitaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabellone t = new Tabellone(5, 5);
        t.CreaTabellone(10);
        System.out.println(t.toString());
    }
    
}
