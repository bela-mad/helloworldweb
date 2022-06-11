package br.com.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller possui o mesmo comportamento que a servlet, conectando o cliente ao servidor
@RestController //abstrai algumas annotations auxiliares para exibição de informação na tela
public class HomeController {

	@RequestMapping("/") //mapeia o endpoint (identificação de funcionalidade na url) que será usado na aplicação
	//@ResponseBody - usado em conjunto com @Controller para exibição de informações na tela
	public String homeMessage() {
		return "Hello World! Hello meninas!!!";
	}
}
