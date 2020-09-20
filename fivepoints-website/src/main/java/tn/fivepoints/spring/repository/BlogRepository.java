package tn.fivepoints.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer> {
	
	@Query(value="select * from blog ORDER BY date Desc LIMIT 3",nativeQuery=true)
	public List<Blog> getLatestBlog();	
	
	@Query(value="select * from blog ORDER BY date Desc LIMIT 4",nativeQuery=true)
	public List<Blog> getLatestArticles();	

}
