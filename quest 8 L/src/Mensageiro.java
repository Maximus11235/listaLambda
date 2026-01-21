public class Mensageiro {
    public void enviar(GerarMensagens gerador){
        String nome=gerador.gerar("maximus");
        System.out.println("Mensagem gerada: "+nome);
    };
}
