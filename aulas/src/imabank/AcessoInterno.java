package imabank;

public interface AcessoInterno {

	//os metodos nao tem comportamento(corpo), so assinatura
	
	/*
	 * @param String usuario => pode-se informar um usuario valido
	 * @param String senha => pode-se informar uma senha com ate 255 caracteres alfanumericos
	 * @return retorna verdadeiro quando a senha estiver correto
	 */
	public boolean autenticarSistema(String usuario, String senha);
}
