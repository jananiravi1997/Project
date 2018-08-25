package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// to map the field of the object
@Table(name="Consumer")// create the table in h2 database

public class Consumer
{
	@Id

    private int ConsumerId;
	@Column(nullable=false)
	private String ConsumerName;
	@Column(nullable=false)
	private String ConsumerPrice;
	@Column(nullable=false)
	private String ConsumerQuality;
	@Column(nullable=false)
	private String ConsumerDescription;
	@Column(nullable=false)
	private String ConsumerColor;

	public int getConsumerId() {
		return ConsumerId;
	}
	public void setConsumerId(int consumerId) {
		ConsumerId = consumerId;
	}
	public String getConsumerName() {
		return ConsumerName;
	}
	public void setConsumerName(String consumerName) {
		ConsumerName = consumerName;
	}
	public String getConsumerPrice() {
		return ConsumerPrice;
	}
	public void setConsumerPrice(String consumerPrice) {
		ConsumerPrice = consumerPrice;
	}
	public String getConsumerQuality() {
		return ConsumerQuality;
	}
	public void setConsumerQuality(String consumerQuality) {
		ConsumerQuality = consumerQuality;
	}
	public String getConsumerDescription() {
		return ConsumerDescription;
	}
	public void setConsumerDescription(String consumerDescription) {
		ConsumerDescription = consumerDescription;
	}
	public String getConsumerColor() {
		return ConsumerColor;
	}
	public void setConsumerColor(String consumerColor) {
		ConsumerColor = consumerColor;
	}
	
}
