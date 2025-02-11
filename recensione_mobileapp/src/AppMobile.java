import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMobile {
    private String nome;
    private SistemaOperativo sistemaOperativo; //richiamo enum
    private float prezzo;
    private List<Recensione> elencoRecensioni;
    private float ricavoTotale;
    Scanner sc = new Scanner(System.in);

    public AppMobile(String nome, SistemaOperativo sistemaOperativo, float prezzo, List<Recensione> elencoRecensioni) {
        this.nome = nome;
        this.sistemaOperativo = sistemaOperativo;
        this.prezzo = prezzo;
        this.elencoRecensioni = new ArrayList<>();
        this.ricavoTotale = 0; // tolgo il ricavoTotale dal costruttore, ma lo inizializzo a 0
    }

    public void download() {
        // incrementa il ricavoTotale del valore del prezzo (un singolo download)
        ricavoTotale = ricavoTotale + prezzo;
        System.out.println("L'app è stata scaricata. È costata " + prezzo + " , per un ricavo totale di " + ricavoTotale + ".");
    }

    public void download(int numeroDownload) {
        // incrementa il ricavoTotale del valore del prezzo*numeroDownload (download
        // multipli)
        ricavoTotale = ricavoTotale + (prezzo * numeroDownload);
        System.out.println("L'app è stata scaricata " + numeroDownload + " volte, per un ricavo totale di " + ricavoTotale + ".");
    }

    public void riceviRecensione() {
        // l'app riceve una nuova recensione
        // chiedo i dati all'utente, creo una recensione e l'aggiungo alla lista

        System.out.println("Crea una nuova recensione");

        LocalDate data = LocalDate.now();
        System.out.print("Data: " + data);

        System.out.print("\nNome: ");
        String nome = sc.nextLine();

        System.out.print("Numero Stelle (da 1 a 5): ");
        int nrStelle = sc.nextInt();
        sc.nextLine();

        System.out.print("Testo: ");
        String testo = sc.nextLine();

        Recensione recensione = new Recensione(data, nome, nrStelle, testo);
        elencoRecensioni.add(recensione);

        System.out.println("Recensione creata");

    }

    public float valutazioneMedia() {
        // restituisce la media delle recensioni ricevute finora (nr stelle)

        // se non ci sono recensioni, ritorna 0
        if (elencoRecensioni.isEmpty()) {
            System.out.println("L'elenco delle recensioni è vuoto.");
            return 0;
        }

        //scorro l'array list e calcolo la media, poi la stampo formattata
        int sommaStelle = 0;
        for (Recensione recensione : elencoRecensioni) {
            sommaStelle += recensione.getNumeroStelle();
        }
        float media = sommaStelle / (float) elencoRecensioni.size();
        System.out.println("La media delle recensioni è: "+ String.format("%.2f", media));
        return media;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public List<Recensione> getElencoRecensioni() {
        return elencoRecensioni;
    }

    public void setElencoRecensioni(List<Recensione> elencoRecensioni) {
        this.elencoRecensioni = elencoRecensioni;
    }

    public float getRicavoTotale() {
        return ricavoTotale;
    }

    public void setRicavoTotale(float ricavoTotale) {
        this.ricavoTotale = ricavoTotale;
    }

}
