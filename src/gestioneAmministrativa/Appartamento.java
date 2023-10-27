
package gestioneAmministrativa;

public class Appartamento {
    private int flatNum;
    private double millesimals;
    private String flatOwner;
    
    public Appartamento(int flatNum, double millesimals) {
        this.flatNum = flatNum;
        this.millesimals = millesimals;
    }
    
    //nel caso della composizione fare la copia.
    public Appartamento(Appartamento copiaApp){
        this.flatNum = copiaApp.flatNum;
        this.flatOwner = copiaApp.flatOwner;
        this.millesimals = copiaApp.millesimals;
    }

    public void setFlatOwner(String flatOwner) {
        this.flatOwner = flatOwner;
    }

    public int getFlatNum() {
        return flatNum;
    }

    public String getFlatOwner() {
        return flatOwner;
    }

    public double getMillesimals() {
        return millesimals;
    }

    @Override
    public String toString() {
        return "Appartamento{" + "flatNum=" + flatNum + ", flatOwner=" + flatOwner + ", millesimals=" + millesimals + '}';
    }
}
