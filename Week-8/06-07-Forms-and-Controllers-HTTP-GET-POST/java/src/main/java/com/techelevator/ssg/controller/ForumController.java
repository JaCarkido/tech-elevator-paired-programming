package com.techelevator.ssg.controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;



@Controller
public class ForumController {
	
	@Autowired
	private ForumDao dao;

	@RequestMapping("/forum")
	public String displayForum() {
		return "forum";
	}
	
	
	@RequestMapping(path="/forum", method=RequestMethod.POST)
	public String forumSubmission(@RequestParam String username,
								  @RequestParam String subject,
								  @RequestParam String message) {   
		
		ForumPost post = new ForumPost(username, subject, message);
		dao.save(post);
		
	
		return "redirect:/messageBoard";  
		
	}
	/*
	
	@RequestMapping(path="/forum", method=RequestMethod.GET)
	public String forumRetreival(@RequestParam String username,
								  @RequestParam String subject,
								  @RequestParam String message,
								  @RequestParam LocalDateTime datePosted){
		
		// right here we get the shits from our db
		
		return "redirect:/forumSomething";   //<-------fix the path here
		
	}
	*/
	@RequestMapping("/messageBoard")
	public String displayAlienAgeResult() {
	
		return "messageBoard";
	}
	
	
	
}