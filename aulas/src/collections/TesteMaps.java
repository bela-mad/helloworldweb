package collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import imabank.Gerente;

public class TesteMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		// put => adicionar valores ao map
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
	
		//buscar valor atraves de uma chave e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("EUA"));
		System.out.println("========================");
		
		//buscar valor atraves de um valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		System.out.println("========================");		
		
		//informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());
		System.out.println("========================");
		
		//Consultar o valor armazenado na chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		System.out.println("========================");
		
		//Remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("========================");
		
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + " => " + quadroMedalhasOlimpicas2020.get(key));
		}
		System.out.println("========================");
		
//		Gerente funcionario = new Gerente("Isabela Madureira","001.122.348-92","87759",2500.0,LocalDate.now());
//		Map<String,List<Gerente> >funcionariosPorEmpresa = new HashMap<>();
//		Map<Integer,Gerente> funcionariosDaEmpresa = new HashMap<>();
		
		TreeMap<String, Integer>quadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey()); //pega a primeira chave
		System.out.println(quadroMedalhasOlimpicas2016.lastKey()); //pega a ultima chave
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China")); //mostra a chave anterior
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China")); //mostra a chave posterior
		
		System.out.println(quadroMedalhasOlimpicas2016.pollFirstEntry()); //exibe o valor e apaga posteriormente
		System.out.println(quadroMedalhasOlimpicas2016.pollLastEntry());  //exibe o valor e apaga posteriormente
		
	}
	
}
