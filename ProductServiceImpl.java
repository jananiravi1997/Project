package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.ProductDAO;
import com.niit.Model.Product;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductDAO pdtdao;
	
	
	public boolean addservice(Product pdt) {
		return (pdtdao.addProduct(pdt));	
	}


	public boolean deleteService(int productId) {
		return (pdtdao.deleteProduct(productId));
		
	}


	public boolean updateservice(Product productId) {
		return(pdtdao.updateProduct(productId));

	}


	public Product getUpdateId(int productId) {
		 return(pdtdao.getUpdateId(productId));
	
	}


	public Product getProductbyId(int productId) {
		 return(pdtdao.getproductbyId(productId));

	}


	public List<Product> getAll() {
		return(pdtdao.getAll());

	}


}
