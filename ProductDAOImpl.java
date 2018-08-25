package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Product;

@Repository("Productdao")
@Transactional

public class ProductDAOImpl implements ProductDAO 
{

	@Autowired
    private SessionFactory sessionFact;	
	private boolean b = true;
	
	public boolean addProduct(Product pd) 
	{
		sessionFact.getCurrentSession().save(pd);
		return true;
	}
	
	public boolean updateProduct(Product pd) 
	{
		 sessionFact.getCurrentSession().update(pd);
		 return true;

	}
	public Product getUpdateId(int productId) 
	{
		return sessionFact.getCurrentSession().get(Product.class, productId);	
	}
	
	public boolean deleteProduct(int productId) 
	{
		Product pdt=getproductbyId(productId);
		if(pdt!=null)
		{
			sessionFact.getCurrentSession().delete(pdt);
				return true;
		}
		else
			return false;

	}
	public Product getproductbyId(int productId)
	{
		return sessionFact.getCurrentSession().get(Product.class, productId);
	}
	
	public List<Product> getAll()
	{
		return (List<Product>) sessionFact.getCurrentSession().createCriteria(Product.class).list();
	
	}	
}
