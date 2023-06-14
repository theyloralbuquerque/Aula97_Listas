package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // List: Tipo da lista; <Integer>: Tipo da lista(lista não aceita primitivos, só wrapper class);
												// new ArrayList<>(): Instanciação da lista, ArrayList é uma classe que implementa a interface List.		
		list.add("Maria"); // Adiciona elementos à lista.
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Insere um elemento dentro de uma determinada posição na lista.
		
		
		System.out.println(list.size()); // list.size() mostra o tamanho da lista.
		for (String x : list) {
			System.out.println(x);
		}
	
		System.out.println("-------------------------");
		/*list.remove(1); */ // Remove um elemento da lista. A lista é capaz de remover um dado a partir da comparação do valor inserido com outro valor da lista.
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove um elemento da lista por predicado! ("Quero remover todo elemento x da lista, tal que todo caractere na posição 0 do elemento seja igual a 'M'.")
												// Aqui acima ocorre uma função LAMBDA, chamada Predicado.
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Index of: " + list.indexOf("Bob")); // Mostra a posição do elemnto na lista.
		System.out.println("Index of: " + list.indexOf("Marco")); // Quando o indexOf não acha o elemento na lista ele diz que a posição dele é -1.
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());  // Pega apenas os elementos da lista que começam com 'A'. 
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o PRIMEIRO elemento que começa com 'A'. Se não tiver na lista ele retorna um valor null.
		System.out.println(name);
		
	}

}
