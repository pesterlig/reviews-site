package com.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review review1 = new Review(01L, "Barley Hopsters", "/images/beer-fridge-b-hopsters.jpg", "images/Barley-hopsters-logo-download.png ","/images/owner-hopsters-with-beer.jpg","Beer Store", "Get craft beer & homebrewing supplies here - Best cameraderie! ", "10/27/2017");
		Review review2 = new Review(02L, "Staas", "images/crowd-inside-staas.jpg", "images/staas-logo.png", "images/glass-beer-staas.jpg", "Brew Pub", "Fresh beer sample tray is amazing!  (And sometimes there's a food truck out back)", "6/08/2016");
		Review review3 = new Review(03L, "Restoration", "images/brew-tanks-restoration.jpg", "images/restoration-logo.jpg",  "/images/beers-place-mat-restoration.jpg", "Brew Pub", "Brewery Tours! Best tapas in town!", "9/27/2017");
		Review review4 = new Review(04L, "Old Bag of Nails", "images/old-bag-outside.jpg", "images/old-bag-logo.png", "images/fried-fish-old-bag.jpg", "Restaurant", "Greasy food; Standard Beer; Awesome locally crafted art jug on bar", "8/22/2015");
		
		
		
		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);
		
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(long id) {
		return reviews.get(id);
	}
}
