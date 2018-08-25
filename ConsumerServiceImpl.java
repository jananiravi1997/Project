package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.ConsumerDAO;
import com.niit.Model.Consumer;


@Service

public class ConsumerServiceImpl implements ConsumerService
{
	@Autowired
	private ConsumerDAO crtdao;
	
	
	public boolean addservice(Consumer crt) {
		return (crtdao.addConsumer(crt));	
	}


	public boolean deleteService(int ConsumerId) {
		return (crtdao.deleteConsumer(ConsumerId));
		
	}


	public boolean updateservice(Consumer ConsumerId) {
		return(crtdao.updateConsumer(ConsumerId));

	}


	public Consumer getUpdateId(int ConsumerId) {
		 return(crtdao.getUpdateId(ConsumerId));
	
	}


	public Consumer getConsumerbyId(int ConsumerId) {
		 return(crtdao.getConsumerbyId(ConsumerId));

	}


	public List<Consumer> getAll() {
		return(crtdao.getAll());

	}


}
