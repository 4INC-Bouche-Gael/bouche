package studente;
/**
 *
 * @author gael.bouche
 */
public class Studente {

    private String nome;
    private String cognome;

    public Studente(String nome, String cognome) throws Exception {
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente s) {
        this.nome = s.nome;
        this.cognome = s.cognome;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws Exception {
        this.nome = controllo(nome, "nome");
    }

    public String getCognome() {
        return cognome;
    }

    public final void setCognome(String cognome) throws Exception {
        this.cognome = controllo(cognome, "cognome");
    }

    private String controllo(String p, String nome) throws Exception {
        try {
            if (!p.isEmpty()) {
                if (Character.isUpperCase(p.charAt(0))) {
                    for (int i = 1; i < p.length(); i++) {
                        char c = p.charAt(i - 1);
                        if (Character.isUpperCase(p.charAt(i)) == false && c == 32) {
                            throw new Exception("La prima lettera del secondo " + nome + " dev'essere maiuscola");
                        }
                        if (!Character.isLetter(c) && c != 32) {
                            throw new Exception("Nel " + nome + " devono esserci solamente lettere");
                        }
                    }
                } else {
                    throw new Exception("La prima lettera dev'esere maiuscola!");
                }
            } else {
                throw new Exception("La stringa non può essere vuota!");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("La stringa non può essere null!");
        }
        return p;
    }

    public String stampa() {
        String t = "";
        t = "nome: " + nome + "\ncognome: " + cognome;
        return t;
    }

}
