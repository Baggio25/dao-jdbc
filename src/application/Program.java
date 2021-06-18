package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao  = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		 /* System.out.println("Test 1: SELLER findById \n" + seller);
		 * 
		 * System.out.println("=================================" );
		 * 
		 */ 
		
		Department department = new Department(2, null); 
		 /* List<Seller> list =
		 * sellerDao.findByDepartment(department);
		 * System.out.println("Test 2: SELLER findByDepartment \n"); for(Seller obj :
		 * list) { System.out.println(obj); }
		 * 
		 * System.out.println("=================================" );
		 * 
		 * list = sellerDao.findAll();
		 * System.out.println("Test 3: SELLER findByAll \n"); for(Seller obj : list) {
		 * System.out.println(obj); }
		 */
		
			/*
			 * System.out.println("=================================" );
			 * System.out.println("Test 4: SELLER insert \n" ); Seller seller = new
			 * Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
			 * sellerDao.insert(seller); System.out.println("Inserted! New id = " +
			 * seller.getId());
			 */
		
		System.out.println("=================================" );
		System.out.println("Test 5: SELLER update \n" );
		seller = sellerDao.findById(1);
		seller.setName("João da Silva");
		seller.setEmail("joao.da.silva@gmail.com");
		sellerDao.update(seller); 
		System.out.println("Update Completed");
	}
}
