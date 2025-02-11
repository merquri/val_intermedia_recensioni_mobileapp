import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        AppMobile test = new AppMobile("Test", SistemaOperativo.ANDROID, 5, null);

        test.download();
        test.download(4);
        test.riceviRecensione();

        sc.close();
    }
}
