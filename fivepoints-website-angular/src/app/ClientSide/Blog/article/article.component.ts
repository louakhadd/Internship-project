import { Component, OnInit } from '@angular/core';
import { BlogService } from "../../../services/blog.service";
import { CommentService } from "../../../services/comment.service";
import { CommentReply } from "../../../entities/commentReply";
import { Blog } from "../../../entities/blog";
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  id: number;
  blog: Blog;
  articles: Blog[];
  commentForm: FormGroup;
  comments: any;
  replys : any;

  pipe = new DatePipe('en-US'); 
  now = Date.now();
  myFormattedDate = this.pipe.transform(this.now, 'yyyy-mm-dd');


  constructor(private route: ActivatedRoute,private router: Router,
    private blogService: BlogService, private commentService :CommentService) { }

  ngOnInit(): void {
    //this.blog = new Blog();

    this.id = this.route.snapshot.params['id'];
    
    this.blogService.getBlog(this.id)
      .subscribe((data : any) => {
        console.log(data)
        this.blog = data;

        this.commentForm = new FormGroup({  
          name : new FormControl('' , [Validators.required] ),
          date : new FormControl(this.myFormattedDate),          
          contenue : new FormControl('' , [Validators.required]),
          email : new FormControl('' , [Validators.required]),  
          blog : new FormControl(this.blog)  
        }); 

      }, error => console.log(error));



      this.commentService.getCommentsByBlog(this.id).subscribe((response:any)=>{
        console.log(response)
          this.comments = response;

          for (let index = 0; index < response.length; index++) {
              console.log(response[index].id)
            
              this.commentService.getReplyByComment(response[index].id).subscribe((response:any)=>{
                console.log('teeest' + response)
                  this.replys = response;                
              });  
  
  
          } 
      });


    /////recent articles
    this.blogService.getLatestArticles().subscribe((response:any)=>{
      this.articles = response;
     
  });

  }
  
  ajouterComment(){
    this.commentService.postComment(this.commentForm.value).subscribe();
     console.log(this.commentForm.value);
   }

   articleDetails(id: number){
    this.router.navigate(['article', id]);
  }
  
}
