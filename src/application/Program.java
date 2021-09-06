package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		//// A estrutura Map não aceita inserir chaves com mesmo valor 
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);/// 
		Product p2 = new Product("Phone", 850.0);
		Product p3 = new Product("Frigobar", 1040.0);
		Product p4 = new Product(" Geladeira", 1050.0);
		
////Map para comparar elementos de chave usa o equals, haschode.
		
		
		stock.put(p4, 50.0);
		stock.put(p3, 40.0);
		stock.put(p2, 30.0);
		stock.put(p1, 25.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains ps Key " + stock.containsKey(ps));
		
	}

}
