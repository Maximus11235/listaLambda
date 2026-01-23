public class App {
    public static void main(String[] args) throws Exception {
    BotaoMagico botao= new BotaoMagico();
    botao.adicionarCliqueListener((evento)->{
        
        if(evento.getOrigem().equals("Botao Magico")){
            System.out.println("Você clicou no Botão Mágico!");
        }
    });
    botao.clicar();
    }
}
