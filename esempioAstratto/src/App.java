public class App {
    public static void main(String[] args) throws Exception {
        
        CompitoScolastico compito1 = new CompitoInClasse("sdfgsdfds", 5, true, "4", "dfgdgd", "matematica", 23);
        CompitoScolastico compito2 = new CompitoACasa("blablabalbal", 8, true, "fai questo e quello", "che bravo");

        compito1.completaCompito();
        compito2.completaCompito();
    }
}
