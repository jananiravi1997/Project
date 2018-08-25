package com.niit.DAO;

import java.util.List;

import com.niit.Model.Consumer;

public interface ConsumerDAO
{
public boolean addConsumer(Consumer cr);
	
	public boolean updateConsumer(Consumer cr);
	
	public Consumer getUpdateId(int ConsumerId );
	
	public boolean deleteConsumer(int ConsumerId);
	
	public Consumer getConsumerbyId(int ConsumerId);
	
	public List<Consumer>getAll();
}
