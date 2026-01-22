@FunctionalInterface
public interface Acao {   
	void executar();
	default void cancelar(){
        System.out.println("ação cancelada");
    }
}
