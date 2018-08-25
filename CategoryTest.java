package com.niit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.HibernateConfig.HibernateConfig;
import com.niit.Model.Category;
import com.niit.Service.CategoryService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfig.class)

public class CategoryTest
{
		@Autowired
		private CategoryService ctServices;
		private Category ctt;
		
		@Before// runs before the execution of test case
		public void setUp() throws Exception {
			
			ctt=new Category();
		}

		@After
		public void tearDown() throws Exception {
			
		}

		@Test
		public void AddCategory()
		{
		  	
			ctt.setCategoryId(130);
			 ctt.setCategoryName("Car");
			 ctt.setCategoryPrice("30330");
			 ctt.setCategoryQuality("Best");
			 ctt.setCategoryDescription("Car 6s");
			 ctt.setCategoryColor("yellow");
		
		  	assertEquals("Success",true,ctServices.addservice(ctt));
		}
		
		 
		 @Test
			public void deleteData()
			{
				assertEquals("not found",true,ctServices.deleteService(127));
			}
		 
		 
		@Test
			public void update() 
			{
				ctt=ctServices.getUpdateId(128);
				ctt.setCategoryName("Applesi");
				
				assertEquals("Successfully Updated",true, ctServices.updateservice(ctt));
			}
		 @Test
			public void getAllCategoryTest()
			{
				List<Category> CategoryList = new ArrayList<Category>();
				CategoryList = ctServices.getAll();
				
				System.out.println("Size of Category = "+CategoryList);
				assertEquals("Success", true, CategoryList.size()!=0);
				
			}
	}
	


