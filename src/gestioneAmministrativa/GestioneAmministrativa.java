
package gestioneAmministrativa;

public class GestioneAmministrativa {
    Condominio condomini[];
    
    public GestioneAmministrativa(Condominio[] condomini) {
        this.condomini = condomini;
    }
    
    /*
    public GestioneAmministrativa(Condominio[] condomini) {
        this.condomini = new Condominio[condomini.length];
        for(int i = 0; i < condomini.length; i++){
            this.condomini[i] = new Condominio(condomini[i]);
            //this.condomini[i] = new Condominio(condomini[i].getCondominioFlats(),condomini[i].getName(),condomini[i].getAddress());
        }
    }
    */

    @Override
    public String toString() {
        return "GestioneAmministrativa{" + "condomini=" + condomini.toString() + '}';
    }
    
    

    
    
    
    
}
