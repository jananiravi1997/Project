package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Consumer;

@Repository("Consumerdao")
@Transactional

public class ConsumerDAOImpl implements ConsumerDAO
{

	@Autowired
    private SessionFactory sessionFact;	
	private boolean b = true;

	public boolean addConsumer(Consumer cr) 
	{
		sessionFact.getCurrentSession().save(cr);
		return true;
	}
	
	public boolean updateConsumer(Consumer cr) 
	{
		 sessionFact.getCurrentSession().update(cr);
		 return true;

	}
	public Consumer getUpdateId(int ConsumerId) 
	{
		return sessionFact.getCurrentSession().get(Consumer.class, ConsumerId);	
	}
	
	public boolean deleteConsumer(int ConsumerId) 
	{
		Consumer crt=getConsumerbyId(ConsumerId);
		if(crt!=null)
		{
			sessionFact.getCurrentSession().delete(crt);
				return true;
		}
		else
			return false;

	}
	public Consumer getConsumerbyId(int ConsumerId)
	{
		return sessionFact.getCurrentSession().get(Consumer.class, ConsumerId);
	}
	
	public List<Consumer> getAll()
	{
		return (List<Consumer>) sessionFact.getCurrentSession().createCriteria(Consumer.class).list();
	
	}	

}
