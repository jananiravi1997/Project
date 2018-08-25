package com.niit.Service;

import java.util.List;

import com.niit.Model.Consumer;

public interface ConsumerService

{
public boolean addservice(Consumer pdt);
	
	public boolean deleteService(int  ConsumerId);
	
	public boolean updateservice(Consumer ConsumerId);
	  
	public Consumer getUpdateId(int  ConsumerId);
	  
	public Consumer getConsumerbyId(int ConsumerId);
	
	public List<Consumer> getAll();
}
