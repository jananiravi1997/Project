package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// to map the field of the object
@Table(name="Supplier")// create the table in h2 database

public class Supplier
{
	
	@Id// Marked as a primary key(64 bit). The value is injected automatically into the DB object

	private int SupplierId;
	@Column(nullable=false)
	private String SupplierName;
	@Column(nullable=false)
	private String SupplierPrice;
	@Column(nullable=false)
	private String SupplierQuality;
	@Column(nullable=false)
	private String SupplierDescription;
	@Column(nullable=false)
	private String SupplierColor;
	
	public int getSupplierId() {
		return SupplierId;
	}
	
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	
	public String getSupplierName() {
		return SupplierName;
	}
	
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	
	public String getSupplierPrice() {
		return SupplierPrice;
	}
	
	public void setSupplierPrice(String supplierPrice) {
		SupplierPrice = supplierPrice;
	}
	
	public String getSupplierQuality() {
		return SupplierQuality;
	}
	
	public void setSupplierQuality(String supplierQuality) {
		SupplierQuality = supplierQuality;
	}
	
	public String getSupplierDescription() {
		return SupplierDescription;
	}
	
	public void setSupplierDescription(String supplierDescription) {
		SupplierDescription = supplierDescription;
	}
	
	public String getSupplierColor() {
		return SupplierColor;
	}
	
	public void setSupplierColor(String supplierColor) {
		SupplierColor = supplierColor;
	}
		
}
