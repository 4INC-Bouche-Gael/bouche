
package supermercato2;

public class Azienda {
    private String nome, indirizzo;
    private Supermercato[] filiari;
    int dimL;

    public Azienda(String nome, String indirizzo, Supermercato[] superMercato) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        dimL = superMercato.length;
        
        filiari = new Supermercato[superMercato.length];
        for(int i = 0; i < superMercato.length; i++){
            
            filiari[i] = new Supermercato(superMercato[i].getNome(), superMercato[i].getIndirizzo());
            
            for(int x = 0; x < superMercato[i].getProdotti().length; x++){
               filiari[x].addProd(superMercato[i].getProdotti()[x]);
            }
        }
        
    }

    private int trovaSup(String nome){
        int pos = -1;
        int cont = 0;
        while(cont < dimL && nome != filiari[cont].getNome()){
            cont ++;
        }
        if(cont < dimL){
            pos = cont;
        }
        return pos;
    }
    
    public void addProdotto(Prodotto p, String nomeSupm){
        if(trovaSup(nomeSupm) >= 0){
            filiari[trovaSup(nomeSupm)].addProd(p);
        }
    }
    
    public void rimuoviProdotto(String barCode, String nomeSupM){
        if(trovaSup(nomeSupM) >= 0){
           filiari[trovaSup(nomeSupM)].removeProd(barCode);
        }
    }
    
    public void addSupermercato(Supermercato nuovoSup){
        if(filiari.length == dimL){
            Supermercato[] filiari2 = new Supermercato[filiari.length+((filiari.length*20)/100)];
            for(int i = 0; i < filiari.length; i++){
                filiari[i] = filiari[i];
            }
            filiari = filiari2;
        }
        filiari[dimL] = nuovoSup;
        dimL++;
    }
    
    public void removeSupermercato(String nomeSup){
        if(trovaSup(nomeSup)>= 0){
            if(trovaSup(nomeSup) <= dimL-1){
            for(int i = trovaSup(nomeSup); i < dimL-1; i++){
                    filiari[i] = filiari[i+1];
                }
                
            }
            dimL--;
        }   
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    
    
}
