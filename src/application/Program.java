package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	//	Department obj = new Department(1, "Books");
	//	System.out.println(obj);
		
		//	Seller sell = new Seller (1, "Vendas", "funcionario@email.com", new Date(), 3000f, new Department(1, "Books"));
		
		//	SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//	System.out.println(sell);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller); 
		
	}
}
