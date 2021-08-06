package application;

import java.util.Locale;

import util.List;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Double> list = new List<Double>();
		
		list.add(3.5);
		list.add(9.2);
		
		System.out.println(list);
	}	
}
