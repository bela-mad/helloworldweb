package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaSets { //não possui indice, mas podemos ver se há um valor lá dentro

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7.5,8.9,10.0,5.5,3.1)); //forma de adicionar valores a uma collection
		
		notas.add(7.5);
		
		System.out.println(notas);
		
		System.out.println("========================");
		
		for(Double doubleTemp : notas) {
			System.out.println(doubleTemp);
		}
		
		System.out.println("========================");
		
		System.out.println("Maior nota: " + Collections.max(notas));
		System.out.println("Menor nota: " + Collections.min(notas));
		
		System.out.println("========================");
		
		double soma = 0;
		
		for(Double doubleTemp : notas) {
			soma += doubleTemp;
		}
		System.out.println("Soma total das notas: " + soma);
		System.out.println("Media das notas: " + (soma/notas.size()));
		
		
		
	}
}
