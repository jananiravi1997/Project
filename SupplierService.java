package com.niit.Service;

import java.util.List;

import com.niit.Model.Supplier;

public interface SupplierService 
{
public boolean addservice(Supplier pdt);
	
	public boolean deleteService(int  SupplierId);
	
	public boolean updateservice(Supplier SupplierId);
	  
	public Supplier getUpdateId(int  SupplierId);
	  
	public Supplier getSupplierbyId(int  SupplierId);
	
	public List<Supplier> getAll();
}
