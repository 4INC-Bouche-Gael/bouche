/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeviceManagement;

/**
 *
 * @author gaelb
 */
public class SmartPhone extends Tablet{
    
    private boolean isDualSim;

    public SmartPhone(String code, String brand, String model, String resolution, boolean isDualSim) {
        super(code, brand, model, resolution);
        this.isDualSim = isDualSim;
    }

    public boolean isIsDualSim() {
        return isDualSim;
    }

    public void setIsDualSim(boolean isDualSim) {
        this.isDualSim = isDualSim;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "isDualSim=" + isDualSim + '}';
    }

    
    
    
}
