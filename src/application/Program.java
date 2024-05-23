package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner scan = new Scanner(System.in);

		System.out.println("== Test 01 - Seller findById ==");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("== Test 02 - Seller findByDepartment ==");
		Department dept = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dept);

		for (Seller c : list) {
			System.out.println(c);
		}

		System.out.println("== Test 03 - Seller findAll ==");
		list = sellerDao.findAll();

		for (Seller c : list) {
			System.out.println(c);
		}

		System.out.println("== Test 04 - Seller Insert ==");
		seller = new Seller(1, "Greg", "greg@email.com", new Date(), 4000f, dept);
		sellerDao.insert(seller);
		System.out.println("Inserted! New Id = " + seller.getId());

		System.out.println("== Test 05 - Seller Update ==");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed.");

		System.out.println("== Test 06 - Seller Delete ==");
		System.out.println("Enter an id to delete from the Seller table: ");
		int id = scan.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed.");

		scan.close();

	}
}
