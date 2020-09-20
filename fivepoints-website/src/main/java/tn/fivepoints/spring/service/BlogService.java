package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.Blog;

public interface BlogService {
	Blog addBlog(Blog blog);
	Blog updateBlog(Blog blog);
	void deleteBlog(int id);
	List<Blog> showAll();
	Blog getBlogById(int id);
	List<Blog> LatestBlogs();
	String introBlog(int id);
	List<Blog> LatestArticles();
}
