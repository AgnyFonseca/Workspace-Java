package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	//LISTA DE TIPO CURINGA ? WILDCARD TYPES
	public static void printList(List<?> list) {
		//list.add(3); ERRO DE COMPILAÇÃO, NÃO PODE ADD DADOS A UMA COLEÇÃO TIPO CURINGA
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
