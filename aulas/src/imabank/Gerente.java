package imabank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno{
	
	//mockado - testa com um valor ja salvo no atributo
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";

	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmissao) {
		super(nome, cpf, ctps, salario, dataDeAdmissao);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return this.getSalario()*0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}

}
