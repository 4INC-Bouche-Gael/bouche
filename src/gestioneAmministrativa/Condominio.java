
package gestioneAmministrativa;

/**
 *
 * @author gael.bouche
 */
public class Condominio {
    private Appartamento[] condominioFlats;
    private String name, address;
    
    /*
    public Condominio(Appartamento[] condominioFlats, String name, String address) {
        this.name = name;
        this.address = address;
        this.condominioFlats = new Appartamento[condominioFlats.length];
        for(int i = 0; i < condominioFlats.length; i++){
            this.condominioFlats[i] = condominioFlats[i];
        }        
    }
    */

    public Condominio(Appartamento[] condominioFlats, String name, String address) {
        this.name = name;
        this.address = address;
        this.condominioFlats = new Appartamento[condominioFlats.length];
        
        for(int i = 0; i < condominioFlats.length; i++){
            this.condominioFlats[i] = new Appartamento(condominioFlats[i]);
        }
    }
    //se fosse doppia composizione 
    public Condominio(Condominio condominioCopia) {
        this.name = condominioCopia.name;
        this.address = condominioCopia.address;
        this.condominioFlats = new Appartamento[condominioFlats.length];
        
        for(int i = 0; i < condominioFlats.length; i++){
            this.condominioFlats[i] = new Appartamento(condominioFlats[i]);
        }

    }

    public Appartamento[] getCondominioFlats() {
        return condominioFlats;
    }

    public void setCondominioFlats(Appartamento[] condominioFlats) {
        this.condominioFlats = condominioFlats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Condominio{" + "condominioFlats=" + condominioFlats.toString() + ", name=" + name + ", address=" + address + '}';
    }
    
    
    
    
    
}
