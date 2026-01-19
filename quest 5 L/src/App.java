public class App {
    public static void main(String[] args) throws Exception {
        Varinha stick= new Varinha();
        stick.usar(()->{
            System.out.println("magia 1 lançada");
        });

        stick.usar(()-> System.out.println("magia 2 lançada"));

        LancarMagia magia= (()->{
            System.out.println("magia 3 lançada");
        });

        stick.usar(magia);
    }
}
