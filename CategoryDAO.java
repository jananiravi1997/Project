package com.niit.DAO;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryDAO
{
	public boolean addCategory(Category ct);
	
	public boolean updateCategory(Category ct);
	
	public Category getUpdateId(int categoryId );
	
	public boolean deleteCategory(int categoryId);
	
	public Category getCategorybyId(int categoryId);
	
	public List<Category>getAll();
}
