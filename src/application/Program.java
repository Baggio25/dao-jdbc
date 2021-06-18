package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao  = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("Test 1: SELLER findById \n" + seller);

		System.out.println("=================================" );
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("Test 2: SELLER findByDepartment \n");
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=================================" );
		
		list = sellerDao.findAll();
		System.out.println("Test 3: SELLER findByAll \n");
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
}
