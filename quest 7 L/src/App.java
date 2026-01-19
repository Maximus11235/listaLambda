public class App {
    public static void main(String[] args) throws Exception {
        CaixaDeSom mp3= new CaixaDeSom();

        mp3.reproduzir((acao1, acao2)->{
            System.out.println("som:"+acao1+"|volume:"+acao2);
        });
    }
}
