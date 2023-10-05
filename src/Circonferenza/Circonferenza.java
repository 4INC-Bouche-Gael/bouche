/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circonferenza;

/**
 *
 * @author gael.bouche
 */
public class Circonferenza {
    //ascissa punto A
    private double x1A;
    
    //ordinata punto A
    private double y1A;
    
    //ascissa punto B
    private double x2B;
    
    //ordinata punto B
    private double y2B;

    public Circonferenza(double x1A, double y1A, double x2B, double y2B) {
        this.x1A = x1A;
        this.y1A = y1A;
        this.x2B = x2B;
        this.y2B = y2B;
    }
    
    public double calcoloRaggio(){
        return Math.sqrt(Math.pow((x1A-x2B),2)+Math.pow((y1A-y2B),2)); 
    }
    
    public double getPerimetro(){
        return calcoloRaggio()*(2*Math.PI);
    }
    
    public double getArea(){
        return Math.PI*(Math.pow(calcoloRaggio(),2));
    }    
    
    
        
    public void setX1A(double x1A) {
        this.x1A = x1A;
    }

    public void setY1A(double y1A) {
        this.y1A = y1A;
    }

    public void setX2B(double x2B) {
        this.x2B = x2B;
    }

    public void setY2B(double y2B) {
        this.y2B = y2B;
    }
    
    
    
    public double getX1A() {
        return x1A;
    }

    public double getY1A() {
        return y1A;
    }

    public double getX2B() {
        return x2B;
    }

    public double getY2B() {
        return y2B;
    }
    
    
    
    
}
