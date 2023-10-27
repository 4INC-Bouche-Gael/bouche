
package trycatch;

public class TryCatch {
    private double base;
    private Double altezza, lato;
    private String colore, id;
    
    public TryCatch(double base, Double altezza, double lato, String colore, String id) throws Exception {
        setBase(base); //il metodo può essere sovrascritto
        setAltezza(altezza);
        setLato(lato);
        setId(id);
        
    }

    public double getBase() {
        return base;
    }
    
    public final void setBase(double base) throws Exception { //final --> non sovrascrivibile 
        if(base > 0)                                          //throw seguito dall'elenco di eccezzioni potenzialmente solleavabili  
            this.base = base;
        else
            throw new Exception("Il valore della base deve essere > 0");
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        if(altezza == null)
            throw new Exception("Il valore non può essere null");
        
        if(altezza > 0)
            this.altezza = altezza;
        else
            throw new Exception("inserire una nuova altezza");
    }

    public Double getLato() {
        return lato;
    }

    public void setLato(double lato) throws Exception {
        try {
            if(lato > 0)
                this.lato = lato;
            else
                throw new Exception("Il valore del lato deve essere > 0");
        } catch (NullPointerException e) {
            throw new NullPointerException("Il valore del lato");
        }
        
    }

    public void getColore() throws Exception {
       try {
            if(!colore.isEmpty())
                this.colore = colore;
            else
                throw new Exception("Il colore non può essere vuoto");
        } catch (NullPointerException e) {
            throw new NullPointerException("Il colore non può essere null");
        } catch (Exception e){
            throw new NullPointerException("Errore generale");
        }
        
    }
    
    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getId() {
        return id;
    }

    public final void setId(String id) throws Exception {
        char[] idChar = new char[2];
        String idNum;
        try {
            if (!id.isEmpty()){
                if (id.length() == 4) {
                idChar = id.substring(0, 2).toCharArray();
                idNum = id.substring(2);
                Integer.parseInt(idNum);
                for (int i = 0; i < 2; i++)
                    if(!Character.isLetter(idChar[i]))
                        throw new Exception("L'id contiene un carattere non valido");
                this.id = id;
                } else {
                    throw new Exception("La lunghezza dell'id non è valida");
                }
            }
            else
                throw new Exception("id vuoto");
        } catch (NullPointerException e) {
            throw new NullPointerException("id vuoto");
        } catch (NumberFormatException e){
            throw new NumberFormatException("L'id contiene un carattere non valido");
        }
    }
    
    
    
    
}
