public class CompitoInClasse extends CompitoScolastico {

    private String aula;
    private String professore;
    private String materia;
    private int numeroStudenti;

    public CompitoInClasse(String descrizione, int voto, boolean completato, String aula, String professore,
            String materia, int numeroStudenti) {
        super(descrizione, voto, completato);
        this.aula = aula;
        this.professore = professore;
        this.materia = materia;
        this.numeroStudenti = numeroStudenti;
    }


    @Override
    public void completaCompito() {
        System.out.println("Eseguo il compito in classe nell'aula " +aula+ " con l'insegnante "+ professore);
    }
    public void avviaCompito() {
        //avvia compito
    }

    public void terminaCompito() {
        //termina compito
    }

    // getters e setters
    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getProfessore() {
        return professore;
    }

    public void setProfessore(String professore) {
        this.professore = professore;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNumeroStudenti() {
        return numeroStudenti;
    }

    public void setNumeroStudenti(int numeroStudenti) {
        this.numeroStudenti = numeroStudenti;
    }

    
}
