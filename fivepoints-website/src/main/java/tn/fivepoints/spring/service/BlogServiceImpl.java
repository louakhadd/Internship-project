package tn.fivepoints.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.Blog;
import tn.fivepoints.spring.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	public static final Logger L = LogManager.getLogger(BlogServiceImpl.class);
	
	@Autowired
	BlogRepository blogRepository;

	@Override
	public Blog addBlog(Blog Blog) {
		// TODO Auto-generated method stub
		return blogRepository.save(Blog);
	}

	@Override
	public Blog updateBlog(Blog Blog) {
		// TODO Auto-generated method stub
		return blogRepository.save(Blog);
	}

	@Override
	public void deleteBlog(int id) {
		// TODO Auto-generated method stub
		blogRepository.delete(blogRepository.findById(id).get());		
	}

	
	@Override
	public List<Blog> showAll() {
		// TODO Auto-generated method stub
		List<Blog> t=(List<Blog>)blogRepository.findAll();
		return t;
	}

	@Override
	public Blog getBlogById(int id) {
		// TODO Auto-generated method stub
		return blogRepository.findById(id).get();	
	}

	@Override
	public List<Blog> LatestBlogs() {
		// TODO Auto-generated method stub
		List<Blog> blogs = blogRepository.getLatestBlog();
		return blogs;
	}

	@Override
	public String introBlog(int id) {
		// TODO Auto-generated method stub
		Blog blog = blogRepository.findById(id).get();
		String intro= blog.getContenue().substring(0,250) + "...";
		return intro;
	}
	
	@Override
	public List<Blog> LatestArticles() {
		// TODO Auto-generated method stub
		List<Blog> blogs = blogRepository.getLatestArticles();
		return blogs;
	}

		

}

	
