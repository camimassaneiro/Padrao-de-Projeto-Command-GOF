package command2.view;

import command.AdicionarEstoque;
import command.Command;
import command.CommandInvoker;
import command.RemoverEstoque;
import controle.Deposito;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 * Essa eh uma versao usando Reflection, aumentando o nivel de reuso do
 *     padrao. 
 * 
 */

public class SistemaV2 {

	public static void main(String[] args) throws Exception {

		CommandInvoker ci = new CommandInvoker();
		Deposito deposito = new Deposito();
		
		Map<Integer, Class<? extends Command>> comandos = new HashMap<>();
		comandos.put(1, AdicionarEstoque.class);
		comandos.put(2, RemoverEstoque.class);
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Deposito : " + deposito.getQuantidade());
			System.out.println("Digite a opcao (1-Adicionar; 2-Remover; 3-Desfazer comando; 4-Refazer comando; 5-Sair)");
			
			int op = s.nextInt();
			if (op == 5) 
				return;
			
			switch (op) {
				case 3: 
					    
					    ci.undo();
				  		break;
			  
				case 4: 
					    
					    ci.redo();
						break;

				default: 
					
					System.out.println("Digite a quantidade");
					int qtdade = s.nextInt();
					
					Class<? extends Command> commClass = comandos.get(op);
					Constructor<? extends Command> constr = commClass.getConstructor(Deposito.class, int.class);
					
					Command comm = constr.newInstance(deposito, qtdade);
					
					ci.add(comm);
					ci.execute();
			}
		} while (true);
	}
	
}
