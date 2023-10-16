
package gestioneAmministrativa;

/**
 *
 * @author gael.bouche
 */
public class Condominio {
    private Appartamento[] condominioFlats;
    private String name, address;

    public Condominio(Appartamento[] condominioFlats, String name, String address) {
        this.name = name;
        this.address = address;
        this.condominioFlats = new Appartamento[condominioFlats.length];
        for(int i = 0; i < condominioFlats.length; i++){
            this.condominioFlats[i] = condominioFlats[i];
        }        
    }
    
    public String numMaxFlat(){
        String txt = "";
        for(int i = 0; i < condominioFlats.length; i++){
            //if(condominioFlats[i].getFlatNum())
        }
        return txt;
    }
    
}
