package com.niit.DAO;

import java.util.List;
import com.niit.Model.Supplier;

public interface SupplierDAO 
{
	public boolean addSupplier(Supplier sr);
	
	public boolean updateSupplier(Supplier sr);
	
	public Supplier getUpdateId(int SupplierId );
	
	public boolean deleteSupplier(int SupplierId);
	
	public Supplier getSupplierbyId(int SupplierId);
	
	public List<Supplier>getAll();
}
