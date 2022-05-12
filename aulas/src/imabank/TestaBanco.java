package imabank;

import java.time.LocalDate;
import java.util.Locale;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma instancia = copia
//		pessoaNumero1.nome = "José das Couves";
//		pessoaNumero1.profissão = "Agricultor";
//		pessoaNumero1.cpf = "750.562.835-68";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissão);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("=======================");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Profissão: " + pessoaNumero2.profissão);
//		System.out.println("CPF: " + pessoaNumero2.cpf);
		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates",
//				"259.800.966-55","123.456-78");
//		
////		System.out.println("Nome: "+ pessoaComConstrutor1.getNome());
////		System.out.println("CPF: "+ pessoaComConstrutor1.getCpf());
////		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
//		
//		PessoaFisica pfIsabela = new PessoaFisica();
//		pfIsabela.setNome("Isabela Argolo");
//		pfIsabela.setEmail("isabela@digitalhouse.com");
//		pfIsabela.setTelefone("25595522556");
//		pfIsabela.setCpf("061.905.611-87");
//		pfIsabela.setProfissao("Desenvolvedora");
//		pfIsabela.setRg("22.678.127-6");
//		
//		Conta conta1 = new Conta();
//		conta1.setAgencia(1234);
//		conta1.setNumeroConta(7889);
//	//	conta1.setSaldo(1000000.50); >>não se deve alterar diretamente essa informação, ela apenas pode ser exibida
//		conta1.setTitular(pfIsabela);
//		
//		conta1.depositar(100000.0);
//		
//		System.out.println("Agencia: " + conta1.getAgencia());
//		System.out.println("Conta: " + conta1.getNumeroConta());
//		System.out.println("Saldo Atual: " + conta1.getSaldo());
//		System.out.println("Titular: " + conta1.getTitular());
//
//		if (conta1.sacar(20.0)) {
//			System.out.println("Saque efetuado com sucesso!");
//		}
//		else {
//			System.out.println("Saldo insuficiente. Verifique o valor do saque!");
//		}
//
//		System.out.println("Saldo Atual: " + conta1.getSaldo());
//		
//		Conta conta2 = new Conta();
//		conta2.setAgencia(5582);
//		conta2.setNumeroConta(2234);
//		
//		conta1.transferir(10000.0, conta2);
//	
//		System.out.println("Saldo Atual conta1: " + conta1.getSaldo());
//		System.out.println("Saldo Atual conta2: " + conta2.getSaldo());
//		
//		ContaCorrente cc1 = new ContaCorrente();
//		cc1.depositar(1000);
//		System.out.println("Saldo: "+cc1.getSaldo());
//		System.out.println("Limite: "+cc1.getLimite());
//		System.out.println("Saldo com Limite: "+cc1.getSaldoComLimite());
//		cc1.sacar(1500);
//		System.out.println("Saldo: " + cc1.getSaldo());
//		System.out.println("Saldo com Limite: "+cc1.getSaldoComLimite());
		
		Locale.setDefault(new Locale("pt","BR")); //serve para impressão de data e moeda de acordo com o país
		Gerente funcionario = new Gerente("Isabela Argolo","001.125.874-98","87759",2500.0, LocalDate.now());
		
		System.out.println(funcionario.toString());
		System.out.printf("Bonus: %.2f", funcionario.getBonus());
				
		boolean resposta = funcionario.autenticarSistema("usuariopadrao", "mudar123");
		
		if (resposta) {
			System.out.println("\nBem-vindo(a) " + funcionario.getNome());
		}
		else {
			System.out.println("\nUsuario ou senha invalidos");
		}
		
		System.out.println("Para trocar a sua senha, informe a antiga:");
		senhaNova
	}
}
