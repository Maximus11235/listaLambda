public class App {
    public static void main(String[] args) throws Exception {
        Microfone micro= new Microfone();
        micro.ouvir(falar->{
            System.out.println("o microfone recebeu: " + falar);

        });
    }
}
