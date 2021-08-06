package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	/*public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	} */
	
	//FUNC�O QUE RECEBE UMA FUN��O LAMBDA COMO ARGUMENTO
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	} 
}