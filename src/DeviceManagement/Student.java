/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeviceManagement;

/**
 *
 * @author gaelb
 */
public class Student {
    private String name, surname;
    DeviceManagement device;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDevice(DeviceManagement device) {
        this.device = device;
    }
    
    
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", device=" + device + '}';
    }
    
    
}
