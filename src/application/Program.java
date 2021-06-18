package application;

import javax.swing.JOptionPane;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao  = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		JOptionPane.showMessageDialog(null, "Test 1: \n" + seller);
	}
}
