package com.reviewssite;

import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository repository = new ReviewRepository();
	
	@RequestMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", repository.findAll());
		System.out.println(model.asMap().toString());
		return "reviews";
	}

	@RequestMapping("/review")
	public String getOneReveiw(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", repository.findOne(id));
		return "review";
	}
	
//	@Autowired
//	public void setReviewRepository(ReviewRepository reviewRepository) {
//		this.repository = reviewRepository;
//	}
	
}
