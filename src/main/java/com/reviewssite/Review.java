package com.reviewssite;

public class Review {
	private final Long id;
	private String title;
	private String imageUrl;
	private String logoImageUrl;
	private String productImageUrl;
	private String reviewCategory;
	private String content;
	private String date;
	
	public Review(Long id){
		this.id = id;
		this.title = "";
		this.imageUrl = "";
		this.logoImageUrl = "";
		this.productImageUrl = "";
		this.reviewCategory = "";
		this.content = "";
		this.date = "";
	}
	
	public Review(Long id, String title, String imageUrl, String logoImageUrl, String productImageUrl, String reviewCategory, String content, String date) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.logoImageUrl = logoImageUrl;
		this.productImageUrl = productImageUrl;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.date = date;
	}

	public String getLogoImageUrl() {
		return logoImageUrl;
	}

	public void setLogoImageUrl(String logoImageUrl) {
		this.logoImageUrl = logoImageUrl;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public void setReviewCategory(String reviewCategory) {
		this.reviewCategory = reviewCategory;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
