
package DeviceManagement;


public class DeviceManagement {
    private String code, brand, model;
    //Student owner;
    
    public DeviceManagement(String code, String brand, String model/*,Student owner*/) {
        this.code = code;
        this.brand = brand;
        this.model = model;
        /*this.owner = new Student(owner.getName(), owner.getSurname());*/
    }    
    /*
    public void assignDevice(){
        owner.setDevice(new DeviceManagement device);
    }
    */
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "DeviceManagement{" + "code=" + code + ", brand=" + brand + ", model=" + model + '}';
    }
    
    
    
}
