/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeviceManagement;

/**
 *
 * @author gaelb
 */
public class Computer extends Device {
    
    private boolean isFisso;

    public Computer(String code, String brand, String model, boolean isFisso) {
        super(code, brand, model);
        this.isFisso = isFisso;
    }

    public boolean isIsFisso() {
        return isFisso;
    }

    public void setIsFisso(boolean isFisso) {
        this.isFisso = isFisso;
    }

    @Override
    public String toString() {
        return "Computer{" + "isFisso=" + isFisso + '}';
    }
    
    
    
}
