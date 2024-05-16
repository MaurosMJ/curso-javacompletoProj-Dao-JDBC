package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	//	Department obj = new Department(1, "Books");
	//	System.out.println(obj);
		
		Seller sell = new Seller (1, "Vendas", "funcionario@email.com", new Date(), 3000f, new Department(1, "Books"));
		System.out.println(sell);
	}
}
