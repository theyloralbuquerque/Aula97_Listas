package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // List: Tipo da lista; <Integer>: Tipo da lista(lista n�o aceita primitivos, s� wrapper class);
												// new ArrayList<>(): Instancia��o da lista, ArrayList � uma classe que implementa a interface List.		
		list.add("Maria"); // Adiciona elementos � lista.
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Insere um elemento dentro de uma determinada posi��o na lista.
		
		
		System.out.println(list.size()); // list.size() mostra o tamanho da lista.
		for (String x : list) {
			System.out.println(x);
		}
	
		System.out.println("-------------------------");
		/*list.remove(1); */ // Remove um elemento da lista. A lista � capaz de remover um dado a partir da compara��o do valor inserido com outro valor da lista.
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove um elemento da lista por predicado! ("Quero remover todo elemento x da lista, tal que todo caractere na posi��o 0 do elemento seja igual a 'M'.")
												// Aqui acima ocorre uma fun��o LAMBDA, chamada Predicado.
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Index of: " + list.indexOf("Bob")); // Mostra a posi��o do elemnto na lista.
		System.out.println("Index of: " + list.indexOf("Marco")); // Quando o indexOf n�o acha o elemento na lista ele diz que a posi��o dele � -1.
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());  // Pega apenas os elementos da lista que come�am com 'A'. 
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o PRIMEIRO elemento que come�a com 'A'. Se n�o tiver na lista ele retorna um valor null.
		System.out.println(name);
		
	}

}
