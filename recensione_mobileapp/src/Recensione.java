import java.time.LocalDate;

public class Recensione {

    private LocalDate data;
    private String nomeUtente;
    private int numeroStelle;
    private String testo;

    //dichiaro valori min e max, finali perché sono quelli e non cambiano
    private final int maxStelle = 5, minStelle = 1;

    public Recensione(LocalDate data, String nomeUtente, int numeroStelle, String testo) {
        this.data = LocalDate.now(); //la data della recensione viene presa sul momento
        this.nomeUtente = nomeUtente;
        this.setNumeroStelle(numeroStelle); //controllo del range nel setter
        this.testo = testo;
    }

    //getters e setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public int getNumeroStelle() {
        return numeroStelle;
    }

    public void setNumeroStelle(int numeroStelle) {
        //controllo se numeroStelle rientra nel range consentito
        if (numeroStelle > maxStelle || numeroStelle < minStelle) {
            throw new IllegalArgumentException(
                    "Numero di stelle non valido, inserire un numero da " + minStelle + " a " + maxStelle + ".");
        } else {
            this.numeroStelle = numeroStelle;
        }

    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Recensione [data=" + data + ", nomeUtente=" + nomeUtente + ", numeroStelle=" + numeroStelle + ", testo="
                + testo + "]";
    }


}
