import java.util.List;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Guilherme Consulini");
		cliente.setCpf(12345678910L);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jamilton Rodrigues");
		cliente2.setCpf(45678912330L);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
		System.out.println("*==================================*");
		cc2.depositar(500);
		cc.transferir(150, poupanca2);
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
		Banco banco = new Banco();
		banco.setConta((List<Conta>) cliente);

	}

}
