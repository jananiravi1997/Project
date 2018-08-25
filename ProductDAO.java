package com.niit.DAO;

import java.util.List;

import com.niit.Model.Product;

public interface ProductDAO 
{
	
	public boolean addProduct(Product pd);
	
	public boolean updateProduct(Product pd);
	
	public Product getUpdateId(int productId );
	
	public boolean deleteProduct(int productId);
	
	public Product getproductbyId(int productId);
	
	public List<Product>getAll();
	
}
