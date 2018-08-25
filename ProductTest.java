package com.niit.Test;

import static org.junit.Assert.*;

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
import com.niit.Model.Product;
import com.niit.Service.ProductService;



	@RunWith(SpringRunner.class)
	@SpringJUnitConfig(classes=HibernateConfig.class)
	public class ProductTest {
		@Autowired
		private ProductService pdServices;
		private Product pdt;
		
		@Before// runs before the execution of test case
		public void setUp() throws Exception {
			
			pdt=new Product();
		}

		@After
		public void tearDown() throws Exception {
			
		}

		@Test
		public void AddProduct()
		{
		  	
			 pdt.setProductId(140);
			 pdt.setProductName("Car");
			 pdt.setProductPrice("30330");
			 pdt.setProductQuality("Best");
			 pdt.setProductDescription("Car 6s");
			 pdt.setProductColor("yellow");
		
		  	assertEquals("Success",true,pdServices.addservice(pdt));
		}
		
		 
		/* @Test
			public void deleteData()
			{
				assertEquals("not found",true,pdServices.deleteService(126));
			}
		 
		 
		@Test
			public void update() 
			{
				pdt=pdServices.getUpdateId(127);
				pdt.setProductName("Appless");
				
				assertEquals("Successfully Updated",true, pdServices.updateservice(pdt));
			}
		 @Test
			public void getAllProductTest()
			{
				List<Product> productList = new ArrayList<Product>();
				productList = pdServices.getAll();
				
				System.out.println("Size of Product = "+productList);
				assertEquals("Success", true, productList.size()!=0);
				
			}*/
	}
	


