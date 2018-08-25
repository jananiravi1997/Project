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
import com.niit.Model.Supplier;
import com.niit.Service.SupplierService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfig.class)

public class SupplierTest 
{

	@Autowired
	private SupplierService srServices;
	private Supplier sr;
	
	@Before// runs before the execution of test case
	public void setUp() throws Exception 
	{	
		sr=new Supplier();
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void AddSupplier()
	{
	  	
		 sr.setSupplierId(137);
		 sr.setSupplierName("Car");
		 sr.setSupplierPrice("30330");
		 sr.setSupplierQuality("Best");
		 sr.setSupplierDescription("Car 6s");
		 sr.setSupplierColor("yellow");
	
	  	assertEquals("Success",true,srServices.addservice(sr));
	}
	
	 
	 @Test
		public void deleteData()
		{
			assertEquals("not found",true,srServices.deleteService(135));
		}
	 
	 
	 @Test
		public void update() 
		{
			sr=srServices.getUpdateId(134);
			sr.setSupplierName("bikes");
			
			assertEquals("Successfully Updated",true, srServices.updateservice(sr));
		}
	 @Test
		public void getAllSupplierTest()
		{
			List<Supplier> SupplierList = new ArrayList<Supplier>();
			SupplierList = srServices.getAll();
			
			System.out.println("Size of Supplier = "+SupplierList);
			assertEquals("Success", true, SupplierList.size()!=0);
			
		}

}
