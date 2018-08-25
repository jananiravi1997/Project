package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.CategoryDAO;
import com.niit.Model.Category;

	@Service
	public class CategoryServiceImpl implements CategoryService
	{
		@Autowired
		private CategoryDAO cttdao;
		
		
		public boolean addservice(Category ctt)
		{
			return (cttdao.addCategory(ctt));	
		}


		public boolean deleteService(int CategoryId) 
		{
			return (cttdao.deleteCategory(CategoryId));
			
		}

		public boolean updateservice(Category CategoryId) {
			return(cttdao.updateCategory(CategoryId));

		}


		public Category getUpdateId(int CategoryId) 
		{
			 return(cttdao.getUpdateId(CategoryId));
		
		}


		public Category getCategorybyId(int CategoryId) {
			 return(cttdao.getCategorybyId(CategoryId));

		}


		public List<Category> getAll() {
			return(cttdao.getAll());

		}


	}

