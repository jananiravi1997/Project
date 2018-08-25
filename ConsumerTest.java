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
import com.niit.Model.Consumer;
import com.niit.Service.ConsumerService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfig.class)

public class ConsumerTest 
{
	@Autowired
	private ConsumerService crServices;
	private Consumer crt;
	
	@Before// runs before the execution of test case
	public void setUp() throws Exception {
		
		crt=new Consumer();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void AddConsumer()
	{
	  	
		 crt.setConsumerId(124);
		 crt.setConsumerName("Car");
		 crt.setConsumerPrice("30330");
		 crt.setConsumerQuality("Best");
		 crt.setConsumerDescription("Car 6s");
		 crt.setConsumerColor("yellow");
	
	  	assertEquals("Success",true,crServices.addservice(crt));
	}
	
	 
	 @Test
		public void deleteData()
		{
			assertEquals("not found",true,crServices.deleteService(129));
		}
	 
	 
	@Test
		public void update() 
		{
			crt=crServices.getUpdateId(128);
			crt.setConsumerName("Appless");
			
			assertEquals("Successfully Updated",true, crServices.updateservice(crt));
		}
	 @Test
		public void getAllConsumerTest()
		{
			List<Consumer> ConsumerList = new ArrayList<Consumer>();
			ConsumerList = crServices.getAll();
			
			System.out.println("Size of Consumer = "+ConsumerList);
			assertEquals("Success", true, ConsumerList.size()!=0);
			
		}
}





