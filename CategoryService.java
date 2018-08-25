package com.niit.Service;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryService
{
	public boolean addservice(Category pdt);
	
	public boolean deleteService(int  CategoryId);
	
	public boolean updateservice(Category CategoryId);
	  
	public Category getUpdateId(int  CategoryId);
	  
	public Category getCategorybyId(int  CategoryId);
	
	public List<Category> getAll();
}

