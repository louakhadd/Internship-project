import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject  } from 'rxjs';

@Injectable()
export class BlogService {

 
  private baseUrl = 'http://localhost:8081/Blogs';

  blogs : any;
  onChangeBlogs:BehaviorSubject<any>;
  constructor(private http: HttpClient) {
    this.onChangeBlogs = new BehaviorSubject([])
   }

  getBlog(id: number){
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createBlog(blog: Object) {
    return this.http.post(`${this.baseUrl}`, blog);
  }

  updateBlog(id: number, value: any) {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteBlog(id: number) {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getBlogsList() {
    /* this.http.get(`${this.baseUrl}`)
     .subscribe((response:any)=>{
       this.onChangeBlogs.next(response)
    });*/
    return this.http.get(`${this.baseUrl}`);
  }   

  getLatestBlog() {
    return this.http.get(`${this.baseUrl}/latest`)
     
  }

  getIntroBlog(id: number){
     return this.http.get(`${this.baseUrl}/intro/${id}`);
  };
  
  getLatestArticles() {
    return this.http.get(`${this.baseUrl}/recent`)
     
  }
}
