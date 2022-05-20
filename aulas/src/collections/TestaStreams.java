package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Maria");
		estudantes.add("Jose");
		estudantes.add("Antonio");
		estudantes.add("Ruy");
		estudantes.add("Pedro");
		estudantes.add("Ana");
		
		//imprime todos os dados da lista
		System.out.println("Lista de Alunos");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("===============================");
		
		//Contador
		System.out.println("Total de EStudantes da lista: " + estudantes.stream().count());
		
		//saber qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		//saber qual o menor nome da lista
		System.out.println("Menor nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
				
		//saber todos os nomes que contem a letra R
		System.out.println("Nomes que contem r: " + estudantes.stream()
			.filter((estudante) -> estudante.toLowerCase().contains("r"))
			.collect(Collectors.toList())
		);
		
		//exibe os n primeiros valores da collection
		System.out.println("Os primeiros tres itens" + estudantes.stream()
			.limit(3)
			.collect(Collectors.toList())
		);
		
		//retorna um valor booleano de acordo com o criterio da busca (verifica se TODAS ocorrencias/nomes tem o elemento)
		System.out.println("Possui a letra q no nome? " + estudantes.stream()
			.allMatch((elemento) -> elemento.contains("q"))
		);
		
		//retorna um valor booleano de acordo com o criterio da busca (se pelo menos um valor possuir o elemento, ele passa true e vale para letras maiusculas e minusculas)
		System.out.println("Alguem possui a letra a no nome? " + estudantes.stream()
				.anyMatch((elemento) -> elemento.contains("a"))
		);
				
		//retorna um valor booleano de acordo com o criterio da busca (se ninguem possuir o elemento)
		System.out.println("Ninguem possui a letra w no nome? " + estudantes.stream()
				.noneMatch((elemento) -> elemento.contains("w"))
		);
		
		//retorna uma nova coleção com o tamanho de cada nome
		System.out.println("Nova coleçao com tamanho: " + estudantes.stream()
				.map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList())
		);
	}
}
