abstract class CompitoScolastico {

    
    private String descrizione;
    private int voto;
    boolean completato = false;

    
    public CompitoScolastico(String descrizione, int voto, boolean completato) {
        this.descrizione = descrizione;
        this.voto = voto;
        this.completato = completato;
    }

    public void completaCompito() {
        System.out.println("Compito completato");
        completato = true;
    }

    public void correggi() {
        System.out.println("Compito corretto");
    }

    // getters e setters
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public boolean isCompletato() {
        return completato;
    }

    public void setCompletato(boolean completato) {
        this.completato = completato;
    }


}
