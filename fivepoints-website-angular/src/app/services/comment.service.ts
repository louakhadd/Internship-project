import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject  } from 'rxjs';

@Injectable()
export class CommentService {

  private baseUrl = 'http://localhost:8081/Comments';

  comments : any;
  onChangeBlogs:BehaviorSubject<any>;
  constructor(private http: HttpClient) {
    this.onChangeBlogs = new BehaviorSubject([])
   }

  postComment(comment) {
    return this.http.post(`${this.baseUrl}`, comment);
  }

  getCommentsByBlog(id: number){
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  getReplyByComment(id: number){
    return this.http.get(`${this.baseUrl}/reply/${id}`);
  }


}
