public class App {
    public static void main(String[] args) throws Exception {
        Mensageiro mensagem=new Mensageiro();
        mensagem.enviar((nome)-> "olá, "+nome+"!");

        mensagem.enviar((nome)->{
            return "olá, "+nome+"!";
        });
    }
}
