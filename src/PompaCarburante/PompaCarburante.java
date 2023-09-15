

package pompaCarburante;

public class PompaCarburante {

    private String nomeDistributore;
    private double prezzoCarburante, capacitaCisterna, carburanteVenduto; //carburantePresente

    public PompaCarburante(String nomeDistributore, double prezzoCarburante, double capacitaCisterna) {
        this.nomeDistributore = nomeDistributore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitaCisterna = capacitaCisterna;
        carburanteVenduto = 0;
    }

    public double calcoloQuantita(){
        return carburanteVenduto;
    }
    
    public double carbRimanente(){                                              //calcolo carburante rimanente nella cisterna
        return capacitaCisterna - carburanteVenduto;
    }    
    
    public double valCarbRimanente(){
        return carbRimanente()*prezzoCarburante;
    }
    
    private double calcPieno(double capienzaSerb, double carburanteMacchina){    //carburante presente nel serbatoio prima del pieno<    
        return (capienzaSerb-carburanteMacchina)*prezzoCarburante;
    }
    
    public double rifornimento(double capienzaSerb, double carburanteMacchina){
        double c = 0;
        if(carbRimanente() >= calcPieno(capienzaSerb, carburanteMacchina)){
            c = calcPieno(capienzaSerb, carburanteMacchina);
        }else{
            c = carbRimanente()*prezzoCarburante;
        }
        
        carburanteVenduto+= c/prezzoCarburante;
        
        return c;
    }
    
    public String getNomeDistributore() {
        return nomeDistributore;
    }

    public void setNomeDistributore(String nomeDistributore) {
        this.nomeDistributore = nomeDistributore;
    }

    public double getPrezzoCarburante() {
        return prezzoCarburante;
    }

    public void setPrezzoCarburante(double prezzoCarburante) {
        this.prezzoCarburante = prezzoCarburante;
    }

    public double getCapacitaCisterna() {
        return capacitaCisterna;
    }

    public void setCapacitaCisterna(double capacitaCisterna) {
        this.capacitaCisterna = capacitaCisterna;
    }

    public double getCarburanteVenduto() {
        return carburanteVenduto;
    }

    public void setCarburanteVenduto(double carburanteVenduto) {
        this.carburanteVenduto = carburanteVenduto;
    }
    
    

}
