package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.SupplierDAO;
import com.niit.Model.Supplier;

	@Service
	public class SupplierServiceImpl implements SupplierService
	{
		@Autowired
		private SupplierDAO srdao;
		
		
		public boolean addservice(Supplier sr)
		{
			return (srdao.addSupplier(sr));	
		}


		public boolean deleteService(int SupplierId) 
		{
			return (srdao.deleteSupplier(SupplierId));
			
		}

		public boolean updateservice(Supplier SupplierId)
		{
			return(srdao.updateSupplier(SupplierId));

		}


		public Supplier getUpdateId(int SupplierId) 
		{
			 return(srdao.getUpdateId(SupplierId));
		
		}


		public Supplier getSupplierbyId(int SupplierId) 
		{
			 return(srdao.getSupplierbyId(SupplierId));

		}


		public List<Supplier> getAll() 
		{
			return(srdao.getAll());
		}


	}


