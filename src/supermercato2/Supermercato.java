
package supermercato2;

public class Supermercato {
    private String nome, indirizzo;
    private Prodotto[] prodotti;
    private int dimL;

    public Supermercato(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        dimL = 0;
        prodotti = new Prodotto[10];
    }
    
    public void addProd(Prodotto newProdotto){
        Prodotto p = new Prodotto(newProdotto);
        if(prodotti.length == dimL){
            Prodotto[] prodotti2 = new Prodotto[prodotti.length+((prodotti.length*20)/100)];
            for(int i = 0; i < prodotti.length; i++){
                prodotti2[i] = prodotti[i];
            }
            prodotti = prodotti2;
        }
        prodotti[dimL] = p;
        dimL++;
    }
    
    private int findProd(String barCode){
        int pos = -1;
        int cont = 0;
        while(cont < dimL && barCode != prodotti[cont].getBarCode()){
            cont ++;
        }
        if(cont < dimL){
            pos = cont;
        }
        return pos;
    }
    
    public void removeProd(String barCode){
        if(findProd(barCode)>= 0){
            if(findProd(barCode) <= dimL-1){
            for(int i = findProd(barCode); i < dimL-1; i++){
                    prodotti[i] = prodotti[i+1];
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

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
}
