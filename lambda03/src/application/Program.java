package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//EXEMPLO 1 IMPLEMENTANDO A INTERFACE COMSUMER, INTERFACE FUNCIONAL
		//list.forEach(new PriceUpdate());
		
		//EXEMPLO 2 REFERENCE METHOD COM MÉTODO ESTÁTICO
		//list.forEach(Product::staticPriceUpdate);
		
		//EXEMPLO 3 REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//EXEMPLO 4 EXPRESSÃO LAMBDA DECLARADA
		double factor = 1.1;
		/*Consumer<Product> cons = p -> { // chaves opcional
			p.setPrice(p.getPrice() * factor);
		}; 
		list.forEach(cons); */
		
		//EXEMPLO 5 EXPRESSÃO LAMBDA INLINE
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		
		list.forEach(System.out::println);
	}
}
