
package gestioneAmministrativa;

public class GestioneAmministrativaTest {

   
    public static void main(String[] args) {
        Appartamento a1 = new Appartamento(1, 200);
        Appartamento a2 = new Appartamento(2, 300);
        Appartamento a3 = new Appartamento(3, 500);
        Appartamento[] a ={a1,a2,a3};
        Condominio c1 = new Condominio(a, "cond1", "via rossi 5");
        
        a1 = new Appartamento(1, 500);
        a2 = new Appartamento(2, 400);
        a3 = new Appartamento(3, 100);
        Appartamento[] aa = {a1,a2,a3};
        Condominio c2 = new Condominio(aa, "cond2", "via gialli 5");
        
        Condominio[] c = {c1,c2};
        GestioneAmministrativa g = new GestioneAmministrativa(c);
        
        System.out.println(g.toString());
        System.out.println(c1.toString());
    }
    
}
