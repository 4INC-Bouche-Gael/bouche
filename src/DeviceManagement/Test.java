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
        
        Device d1 = new Device(pc1.getCode(), pc1.getBrand(), pc1.getModel());
        System.out.println(d1.toString());
        
        System.out.println("---------------------------------------------------------------------------------");
        
        tab1 = tel1;
        System.out.println(tab1.toString());
        
        /*
        tel1 = (SmartPhone) tab1;
        Device d2 = new Device(tel1.getCode(), tel1.getBrand(), tel1.getModel());
        System.out.println(d1.toString());
        */
        System.out.println("---------------------------------------------------------------------------------");
        
        Student pippo = new Student("Pippo", "Rossi");
        pippo.setDevice(d1);
        System.out.println(pippo.toString());
        
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println(d1.getBrand());
        System.out.println(d1.getCode());
        System.out.println(d1.getModel());
        
        System.out.println("---------------------------------------------------------------------------------");
        
        Device d2 = new SmartPhone("AAABBB", "giggio",  "X23", "33x22", true);
        System.out.println(d2.toString());
        
        System.out.println("---------------------------------------------------------------------------------");
        
        Student gino = new Student("Gino", "Bertuzzi");
        gino.setDevice(d2);
        System.out.println(gino.toString());
        
    }
    
}
