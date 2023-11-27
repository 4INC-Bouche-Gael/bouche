/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DeviceManagement;

/**
 *
 * @author gaelb
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computer pc1    = new Computer("ABC123", "HP", "pro2", false);
        Computer pc2    = new Computer("DEF456", "HP", "pro3", true);
        Tablet   tab1   = new Tablet("GHI789", "Snasmung", "GX2r", "300x200");
        Tablet   tab2   = new Tablet("GHIAAA", "Snasmung", "GX3r", "300x200");
        SmartPhone tel1 = new SmartPhone("LMN123", "Apple", "13", "160x80", true);
        SmartPhone tel2 = new SmartPhone("OPQ456", "Apple", "12", "160x80", false);
        
        DeviceManagement d1 = new DeviceManagement(pc1.getCode(), pc1.getBrand(), pc1.getModel());
        System.out.println(d1.toString());
        
        tab1 = tel1;
        System.out.println(tab1.toString());
    }
    
}
