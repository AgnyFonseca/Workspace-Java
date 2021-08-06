package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//PRINCIPIO GET/PUT - COVARIÂNCIA
		/*List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0); */
		//list.add(20); // erro de compilacao
		
		//GET - OK
		//PUT - ERROR
		
		//PRINCIPIO GET/PUT - CONTRAVARIÂNCIA
		/*List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14); */
		
		//Number x = myNums.get(0); // erro de compilacao
		
		//GET - ERROR
		//PUT - OK
		
		
	}

}
