public class CompitoACasa extends CompitoScolastico {

    private String consegna;
    private String commentiInsegnante;
    
    public CompitoACasa(String descrizione, int voto, boolean completato, String consegna, String commentiInsegnante) {
        super(descrizione, voto, completato);
        this.consegna = consegna;
        this.commentiInsegnante = commentiInsegnante;
    }

    @Override
    public void completaCompito() {
        System.out.println("Il compito che aveva questa consegna: '" + this.consegna + "' è stato completato.");
    }

    public void riceviCommento() {
        //ricevi commento
    }

    // getters e setters
    public String getConsegna() {
        return consegna;
    }

    public void setConsegna(String consegna) {
        this.consegna = consegna;
    }

    public String getCommentiInsegnante() {
        return commentiInsegnante;
    }

    public void setCommentiInsegnante(String commentiInsegnante) {
        this.commentiInsegnante = commentiInsegnante;
    }

    
}
