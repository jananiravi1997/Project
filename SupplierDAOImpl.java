package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Category;
import com.niit.Model.Supplier;

@Repository("Supplierdao")
@Transactional

public class SupplierDAOImpl  implements SupplierDAO
{
	@Autowired
    private SessionFactory sessionFact;	
	private boolean b = true;
	
	public boolean addSupplier(Supplier sr) 
	{
		sessionFact.getCurrentSession().save(sr);
		return true;
	}
	
	public boolean updateSupplier(Supplier sr)
	{
		 sessionFact.getCurrentSession().update(sr);		
			return true;

	}
	public Supplier getUpdateId(int SupplierId) 
	{
		return sessionFact.getCurrentSession().get(Supplier.class, SupplierId);
		
	}
	
	public boolean deleteSupplier(int SupplierId)
	{
		Supplier srt=getSupplierbyId(SupplierId);
		if(srt!=null)
		{
			sessionFact.getCurrentSession().delete(srt);
				return true;
		}
		else
			return false;

	}
	public Supplier SupplierbyId(int SupplierId)
	{
		return sessionFact.getCurrentSession().get(Supplier.class, SupplierId);
		
	}
	public List<Supplier> getAll()
	{
		return (List<Supplier>) sessionFact.getCurrentSession().createCriteria(Supplier.class).list();
	
	}

	public Supplier getSupplierbyId(int SupplierId)
	{			return sessionFact.getCurrentSession().get(Supplier.class, SupplierId);
}
}
