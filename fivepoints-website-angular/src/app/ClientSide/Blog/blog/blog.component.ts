import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { Blog } from "../../../entities/blog";
import { BlogService } from "../../../services/blog.service";

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {
  blogs: any;
  articles : Blog[];
  blog : Blog;
  loading:boolean;

 

  constructor(private blogService: BlogService,
    private router: Router) { }

    ngOnInit() {

     

      // this.blogService.getBlogsList().subscribe((response:any)=>{
      //   console.log(response)
      //     this.blogs = response;
      // });

      this.blogService.getBlogsList().subscribe((response:any)=>{
        this.blogService.onChangeBlogs.next(response)
     });;

      this.blogService.onChangeBlogs.subscribe((data:any)=>{
        console.log('dataaa',data);
          this.blogs = data;
          this.blogs.map(blog => {
            this.blogService.getIntroBlog(blog.id).subscribe((res: any) => {
              blog['subtitle'] = res.jsonString;
            });
          });
      });

      /////recent articles
      this.blogService.getLatestArticles().subscribe((response:any)=>{
          this.articles = response;
          console.log('teeest', response);
          
      });
  
    }
  
    articleDetails(id: number){
      this.router.navigate(['article', id]);
    }




    
      
  
 
}
