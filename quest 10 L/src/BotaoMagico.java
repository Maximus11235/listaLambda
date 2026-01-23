public class BotaoMagico {
    CliqueListener cl;
    
    public void adicionarCliqueListener(CliqueListener listener){
        this.cl=listener;
    }
    public void clicar(){
        EventoClique evento= new EventoClique("Botao Magico");
        if(cl != null){
            cl.aoClicar(evento);
        }
    }
}
