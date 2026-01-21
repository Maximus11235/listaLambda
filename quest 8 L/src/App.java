public class App {
    public static void main(String[] args) throws Exception {
        Mensageiro mensagem=new Mensageiro();
        mensagem.enviar((msg)-> "olá, "+msg+"!");

        mensagem.enviar(msg->{
            return "olá, "+msg+"!";
        });
    }
}
