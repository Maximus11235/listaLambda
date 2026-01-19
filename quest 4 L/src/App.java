public class App {
    public static void main(String[] args) throws Exception {
        Botao button=new Botao();
        EmitirSom somdeGato=(()->{
            System.err.println("miau miau");
        });
        button.apertar(somdeGato);
    }
}
