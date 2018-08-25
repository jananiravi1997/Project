package com.niit.Service;

import java.util.List;

import com.niit.Model.Product;

public interface ProductService
{
	public boolean addservice(Product pdt);
	
	public boolean deleteService(int  productId);
	
	public boolean updateservice(Product productId);
	  
	public Product getUpdateId(int  productId);
	  
	public Product getProductbyId(int  productId);
	
	public List< Product> getAll();
}
