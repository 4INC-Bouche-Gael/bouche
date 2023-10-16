
package gestioneAmministrativa;

public class Appartamento {
    private int flatNum;
    private double millesimals;
    private String flatOwner;
    

    public Appartamento(int flatNum, String flatOwner, double millesimals) {
        this.flatNum = flatNum;
        this.flatOwner = flatOwner;
        this.millesimals = millesimals;
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
