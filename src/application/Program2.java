package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner scan = new Scanner(System.in);
		List<Department> list;
		Department dept;

		System.out.println("== Test 01 - Department findById ==");
		dept = departmentDao.findById(1);
		System.out.println(dept);

		System.out.println("== Test 02 - Department findAll ==");
		list = departmentDao.findAll();

		for (Department c : list) {
			System.out.println(c);
		}

		System.out.println("== Test 03 - Department Insert ==");
		dept = new Department(1, "Compras");
		departmentDao.insert(dept);
		System.out.println("Inserted! New Id = " + dept.getId());

		System.out.println("== Test 04 - Department Update ==");
		dept = departmentDao.findById(2);
		dept.setName("Consultoria");
		departmentDao.update(dept);
		System.out.println("Update completed.");

		System.out.println("== Test 05 - Department Delete ==");
		System.out.println("Enter an id to delete from the Department table: ");
		int id = scan.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed.");

		scan.close();

	}
}
