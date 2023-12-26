package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		
		SellerDao sellerDao = new SellerDaoJDBC(DB.getConnection());
		return sellerDao;
		
	}
}
