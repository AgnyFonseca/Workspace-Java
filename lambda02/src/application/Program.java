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
		
		//EXEMPLO 1 IMPLEMENTANDO A INTERFACE PREDICATE, INTERFACE FUNCIONAL
		//list.removeIf(new ProductPredicate());
		
		//EXEMPLO 2 REFERENCE METHOD COM MÉTODO ESTÁTICO
		//list.removeIf(Product::staticProductPredicate);
		
		//EXEMPLO 3 REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//EXEMPLO 4 EXPRESSÃO LAMBDA DECLARADA
		double min = 100.0;
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//list.removeIf(pred);
		
		//EXEMPLO 5 EXPRESSÃO LAMBDA INLINE
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
