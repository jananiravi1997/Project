package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category 
{
	@Id

    private int categoryId;
	@Column(nullable=false)
	private String categoryName;
	@Column(nullable=false)
	private String categoryPrice;
	@Column(nullable=false)
	private String categoryQuality;
	@Column(nullable=false)
	private String categoryDescription;
	@Column(nullable=false)
	private String categoryColor;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryPrice() {
		return categoryPrice;
	}
	public void setCategoryPrice(String categoryPrice) {
		this.categoryPrice = categoryPrice;
	}
	public String getCategoryQuality() {
		return categoryQuality;
	}
	public void setCategoryQuality(String categoryQuality) {
		this.categoryQuality = categoryQuality;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryColor() {
		return categoryColor;
	}
	public void setCategoryColor(String categoryColor) {
		this.categoryColor = categoryColor;
	}
	
}
