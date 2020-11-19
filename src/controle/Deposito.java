package controle;


public class Deposito {

	private int quantidade;
	
	public void add(int qtdade) {
		this.quantidade += qtdade;
	}
	
	public void remove(int qtdade) {
		this.quantidade -= qtdade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
}
