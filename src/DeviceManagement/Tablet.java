/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeviceManagement;

/**
 *
 * @author gaelb
 */
public class Tablet extends Device {
    
    private String resolution;

    public Tablet(String code, String brand, String model, String resolution) {
        super(code, brand, model);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Tablet{" + "code= " + super.getCode() + ", brand= " + super.getBrand() + ", model= " + super.getModel() + "Resolution: "+ resolution + '}';
    }
    
    
}
