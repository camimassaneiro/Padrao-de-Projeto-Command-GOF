package command;

import controle.Deposito;

public class AdicionarEstoque implements Command {

	private Deposito deposito;
	private int qtdade;

	public AdicionarEstoque(Deposito deposito, int qtdade) {
		this.deposito = deposito;
		this.qtdade = qtdade;
	}
	
	@Override
	public void execute() {
		deposito.add(qtdade);
	}

	@Override
	public void undo() {
		deposito.remove(qtdade);
	}

	@Override
	public void redo() {
		deposito.add(qtdade);
	}

}
