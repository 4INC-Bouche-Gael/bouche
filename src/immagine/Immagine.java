
package immagine;


public class Immagine {
    
    private Pixel[][] image; 

    public Immagine(Pixel[][] p) {
        
        image = new Pixel[p.length][];
        for (int i = 0; i < image.length; i++) {
            image[i] = new Pixel [p[i].length]; 
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = p[i][j]; 
            }
            }
    }
    //restituisce il tono dell'immagine
    public String imageTone(int h, int b){
        return image[h][b].pixelTone();  
    }
 
    public String printImage(){
    
        String s="Immagine:\n"; 
        
        for (int i = 0; i < image.length; i++) { 
            s+= "Pixel["+i+"]:\n"; 
            for (int j = 0; j < image[i].length; j++) { 
                s+= "["+j+"] = " + image[i][j].toString()+ " "; 
            }
            }
        
        return s; 
        }
    
}
