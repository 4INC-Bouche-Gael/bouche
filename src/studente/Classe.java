package studente;

/**
 *
 * @author gael.bouche
 */
public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++) {
            this.studenti[i] = new Studente(studenti[i]);
        }
        this.capoClasse = setCapoClasse(capoClasse);
    }

    public final Studente setCapoClasse(Studente capoClasse) throws Exception {
        try {
            if (capoClasse == null) {
                throw new Exception("il capo classe non e' presente nella classe");
            }

        } catch (Exception e) {
            throw e;
        }
        return capoClasse;
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void invertiAttributi() {
        //Non ho capito cosa fare in questo metodo
    }

    public String stampa() {
        String t = "nome capo Classe: " + capoClasse.getNome() + " " + capoClasse.getCognome() + "\n";
        for (int i = 0; i < studenti.length; i++) {
            t += "studenti numero " + (i + 1) + " " + studenti[i].getNome() + " " + studenti[i].getCognome() + "\n";
        }
        return t;
    }
}
