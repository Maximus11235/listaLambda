public class App {
    public static void main(String[] args) throws Exception {
        Acao acao= ()->{
            System.out.println("você andou");
        };
        
        acao.executar();
        acao.cancelar();
    }
}
