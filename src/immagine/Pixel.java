
package immagine;


public class Pixel {
    
    private double[] RGBcode;

    public Pixel(int[] c) {
        RGBcode = new double[3]; 
        
        for (int i = 0; i < RGBcode.length; i++) {
            RGBcode[i] = c [i]; 
        }
    }
    
    public Pixel(){
        RGBcode = new double[RGBcode.length]; 
    }
    
    
    //il metodo restituisce la tonalità dell'immagine se è calda o fredda
    public String pixelTone(){ 
        String s = "IL TONO E' CALDO"; 
        if((RGBcode[2]/255)>= 0.5){ // se il blu supera 127 sarà freddo
            s = " IL TONO E' FREDDO"; 
        }
        return s; 
    }
    
    public String toString(){
        String s; 
        s= "Il Rosso e:"+ RGBcode[0]+"\nIl Verde e:"+ RGBcode[1]+"\nIl Blu e:"+RGBcode[0]; 
        return s; 
    }
      
}
