package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Category;
import com.niit.Model.Product;


@Repository("Categorydao")
@Transactional

public class CategoryDAOImpl implements CategoryDAO
{
	
		@Autowired
	    private SessionFactory sessionFact;	
		private boolean b = true;
		
		public boolean addCategory(Category ct) 
		{
			sessionFact.getCurrentSession().save(ct);
			return true;
		}
		
		public boolean updateCategory(Category ct)
		{
			 sessionFact.getCurrentSession().update(ct);		
				return true;

		}
		public Category getUpdateId(int CategoryId) 
		{
			return sessionFact.getCurrentSession().get(Category.class, CategoryId);
			
		}
		
		public boolean deleteCategory(int CategoryId)
		{
			Category ctt=getCategorybyId(CategoryId);
			if(ctt!=null)
			{
				sessionFact.getCurrentSession().delete(ctt);
					return true;
			}
			else
				return false;

		}
		public Category CategorybyId(int CategoryId)
		{
			return sessionFact.getCurrentSession().get(Category.class, CategoryId);
			
		}
		public List<Category> getAll()
		{
			return (List<Category>) sessionFact.getCurrentSession().createCriteria(Category.class).list();
		
		}

		public Category getCategorybyId(int categoryId) {
			// TODO Auto-generated method stub
			return sessionFact.getCurrentSession().get(Category.class, categoryId);
		}
	}


