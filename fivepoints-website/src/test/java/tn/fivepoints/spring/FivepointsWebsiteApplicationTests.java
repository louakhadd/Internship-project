package tn.fivepoints.spring;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.fivepoints.spring.entities.Blog;
import tn.fivepoints.spring.entities.Comment;
import tn.fivepoints.spring.service.BlogService;
import tn.fivepoints.spring.service.CommentService;
import tn.fivepoints.spring.service.FormationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FivepointsWebsiteApplicationTests {

	@Autowired 
	FormationService userService;
	
	@Autowired 
	BlogService blogService;
	
	@Autowired 
	CommentService commentService;
	
	@Test
	public void contextLoads() {
	
		//suserService.like(1);
		
	}

}
