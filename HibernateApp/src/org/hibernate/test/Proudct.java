package org.hibernate.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Proudct {
	@Id
	@GeneratedValue
	private int id;
	private String productId;
	private String title;
	@Column(length = 2000)
	private String imageUrlStr;
	private Double mrp;
	private Double price;
	@Column(length = 2000)
	private String productUrl;
	private String categories;
	private String productBrand;
	private String deliveryTime;
	private Boolean inStock;
	private String codAvailable;
	private String emiAvailable;
	private String offers;
	private Double discount;
	private Double cashBack;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrlStr() {
		return imageUrlStr;
	}

	public void setImageUrlStr(String imageUrlStr) {
		this.imageUrlStr = imageUrlStr;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Boolean getInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public String getCodAvailable() {
		return codAvailable;
	}

	public void setCodAvailable(String codAvailable) {
		this.codAvailable = codAvailable;
	}

	public String getEmiAvailable() {
		return emiAvailable;
	}

	public void setEmiAvailable(String emiAvailable) {
		this.emiAvailable = emiAvailable;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getCashBack() {
		return cashBack;
	}

	public void setCashBack(Double cashBack) {
		this.cashBack = cashBack;
	}

}
