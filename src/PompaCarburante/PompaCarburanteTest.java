
package PompaCarburante;

public class PompaCarburanteTest {
    
    public static void main(String[] args) {
        
        /*
        double a  = p1.rifornimento(50, 10);
        System.out.println(a + " - " + a/p1.getPrezzoCarburante());
        
        a  = p1.rifornimento(70, 5);
        System.out.println(a + " - " + a/p1.getPrezzoCarburante());
        */
        
        PompaCarburante p1 = new PompaCarburante("Esso", 0.98, 10);
        PompaCarburante p2 = new PompaCarburante("Eli", 1.00, 8);
        PompaCarburante p3 = new PompaCarburante("EliPro", 1.5, 12);
        
        PompaCarburante [] distributori = {p1,p2,p3};
        
        System.out.println(confrontoPrezzi(distributori));
        }
        
        
    
        public static String confrontoPrezzi(PompaCarburante[] distributori){
            PompaCarburante p = null;
            for(int i = 0; i < distributori.length; i++){
                if(distributori[i].carbRimanente() >= 10 && (p==null || distributori[i].getPrezzoCarburante()<p.getPrezzoCarburante()))
                    p=distributori[i];
            }
            return p.getNomeDistributore();
        }
}
