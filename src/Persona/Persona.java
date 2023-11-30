
package Persona;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Persona {
    private String nome, cognome, codFisc, dataNasc;
    private int numeroIstanze;
    private final String PATTERN= "dd-MM-yyyy";
    
    public Persona(String nome, String cognome, String codFisc, String dataNasc)throws Exception{
        
        String [] parole = nome.split(" ");
        for(String parola: parole){
            controllaInput(parola);
        }
         this.nome = nome;
        
        parole = cognome.split(" ");
        for(String parola: parole){
            controllaInput(parola);
        }
        this.cognome = cognome; 
 
        this.codFisc = codFisc;
        this.dataNasc = dataNasc;
        
    }
    
    public void controllaInput(String controllo)throws Exception{
        
        if(controllo.charAt(0)<65 && controllo.charAt(0)>90){
            throw new IOException("Le iniziali devono essere maiuscole");
        }
        
        for(int i = 1; i < controllo.length(); i++){
            if(controllo.charAt(1)<97 && controllo.charAt(1)>122){
                throw new IOException("Può contenere solo lettere");
            }
        }
        
    }
    
    public void controllaDataJava(String dataNascita)throws Exception{
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone( "Europe/Rome"),Locale.ITALY);
        Date oggi = calendar.getTime(); 
        SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN); 
        Date dataDiNascita = dateFormat.parse(dataNascita);
        if(dataDiNascita.after(oggi) && dataDiNascita.before(dateFormat.parse("01-01-1900"))){
            throw new IOException("La data non è valida");
        }
    }
    
    public void controllaDataManuale(String dataNascita)throws Exception{
        String [] data = dataNascita.split("-");
        if(data.length != PATTERN.split("-").length){
            throw new Exception("Data non valida");    
        }
        int posizioneDD = 0;
        int posizioneMM = 0;
        int posizioneYY = 0;
        for(int i = 0; i < PATTERN.split("-").length; i++){
            if("dd".equalsIgnoreCase(PATTERN.split("-")[i])){
                posizioneDD = i;
            }
            
            if("MM".equalsIgnoreCase(PATTERN.split("-")[i])){
                posizioneMM = i;
            }
            
            if("yyyy".equalsIgnoreCase(PATTERN.split("-")[i])){
                posizioneYY = i;
            }   
        }
    }
    
    
    public boolean verificaOmonimia(Persona persona){
        boolean ris = false;
        if(persona.getNome() == this.nome && persona.getCognome() == this.cognome){
            ris = true;
        }
        return ris;
    }
    
    
    
    /*
    public Integer calcolaEtà(){
        LocalDate dataOdierna = LocalDate.now();
        Integer anno = dataOdierna.getDayOfYear();
        
        return 
    }
    */
    
    
   

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", codFisc=" + codFisc + ", dataNasc=" + dataNasc + '}';
    }

    
    
    public Persona(Persona p) {
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setNumeroIstanze(int numeroIstanze) {
        this.numeroIstanze = numeroIstanze;
    }
    
    
    
}
