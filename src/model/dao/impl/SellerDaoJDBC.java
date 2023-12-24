package model.dao.impl;

import java.util.List;

import model.dao.SellerDao;
import model.entities.Seller;

public abstract class SellerDaoJDBC implements SellerDao {
	
	@Override
	public void insert(Seller obj) {
		
	}
	
	@Override
	public void update(Seller obj) {
		
	}
	
	public void deleteById(Integer id) {
		
	}
	
	@Override
	public Seller findById(Integer id) {
		return null;
	}
	
	@Override
	public List<Seller> findAll(){
		return null;
	}	
}
