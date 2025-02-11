import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //chiedo all'utente di creare un'app

        System.out.println("Crea un'app");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        // mostro la lista di sistemi operativi, usando arrays.tostring per stampare l'enum
        System.out.print("Sistema Operativo (" + Arrays.toString(SistemaOperativo.values()) + "): ");
        // leggo l'input dell'utente e lo associo all'elemento nell'enum
        SistemaOperativo sistema = SistemaOperativo.valueOf(sc.next().toUpperCase());

        System.out.println("Prezzo: ");
        float prezzo = sc.nextFloat();
        sc.nextLine();

        AppMobile app1 = new AppMobile(nome, sistema, prezzo, new ArrayList<>());

        //inizializzo un boolean per il loop
        boolean menu = true;
        do {
        System.out.println("-------- Menù --------");
        System.out.println("1. Download singolo");
        System.out.println("2. Download multiplo");
        System.out.println("3. Ricevi recensione");
        System.out.println("4. Visualizza recensioni");
        System.out.println("5. Esci");

        String strNum = sc.nextLine();
        int num = Integer.parseInt(strNum);
    
        switch (num) {
            case 1:
                // download singolo
                app1.download();
                break;
                
            case 2:
                // download multiplo, prima chiedo un numero all'utente
                System.out.println("Quante volte vuoi fare il download?");
                int numDownload = sc.nextInt();
                sc.nextLine();
                app1.downloadMultiplo(numDownload);
                break;

            case 3:
                // ricevi recensione
                app1.riceviRecensione();
                break;
            case 4:
                // visualizza recensioni
                app1.stampaRecensioni();
                app1.valutazioneMedia();
                break;
            case 5:
                // esci
                menu= false;
                break;
            default:
                // se viene immesso qualsiasi altro numero
                System.out.println("Operazione non valida");
                return;
        }
    } while(menu);

    System.out.println("Fine");


        /* this.nome = nome;
        this.sistemaOperativo = sistemaOperativo;
        this.prezzo = prezzo;
        this.elencoRecensioni = new ArrayList<>();
        this.ricavoTotale = 0;
        Menu menu = new Menu();

        menu.mostraOpzioni();

        /* AppMobile test = new AppMobile("Test", SistemaOperativo.ANDROID, 5, null);

        test.download();
        test.download(4);
        test.riceviRecensione(); */
    }
}
