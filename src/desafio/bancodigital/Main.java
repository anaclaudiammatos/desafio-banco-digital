package desafio.bancodigital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num = 1;
		while(num != 0) {
			
			System.out.println("-------------------------------------");
			System.out.println("[ 1 ] - Criar Conta");
			System.out.println("[ 0 ] - Sair");
			System.out.println("-------------------------------------");
			
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("[ 1 ] - Conta Corrente");
				System.out.println("[ 2 ] - Conta Poupança");
				num = scan.nextInt();
				
				if(num == 1) {
					criarConta("cc", scan);
				}else if(num == 2){
					criarConta("cp", scan);
				}else {
					System.out.println("Opção Invalida.");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Invalida.");
				break;
			}
		}	
		if(num != 0) {
			System.out.println("Numero invalido.");
		}else {
			System.out.println("Saindo....");
		}
	}
	
	public static void criarConta(String tipo, Scanner scan) {
		
		System.out.println("Digite seu Nome: ");
		String nome = scan.next();
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		Conta conta;
		
		if(tipo == "cc") {
			conta = new ContaCorrente(cliente);
		}else {
			conta = new ContaPoupanca(cliente);
		}
		System.out.println("Conta Criada com Sucesso:");
		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.println("Numero da Conta: " + conta.getNumero());
		System.out.println("Numero da Agencia: " + conta.getAgencia());
	}
}
