import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { TrainingService } from "../../services/training.service";
import { UserService } from "../../services/user.service";
import { BlogService } from "../../services/blog.service";
import { User } from "../../entities/user";
import { trainingCategory } from "../../entities/trainingCategory";
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {
  users: User[];
  category= trainingCategory;
  categoryOptions= [];

  pipe = new DatePipe('en-US'); 
  now = Date.now();
  myFormattedDate = this.pipe.transform(this.now, 'yyyy-mm-dd');


  constructor(private trainingService: TrainingService, private userService: UserService, 
    private blogService: BlogService, private router: Router) { }

  trainingForm = new FormGroup({  
    title : new FormControl('' , [Validators.required] ),
    description : new FormControl('' , [Validators.required] ),  
    prix : new FormControl('' , [Validators.required]),  
    nbParticipants : new FormControl('' , [Validators.required]),
    nbHeuresD : new FormControl('' , [Validators.required]),  
    nbHeuresND : new FormControl('' , [Validators.required]),
    nblike : new FormControl(0)
    // category : new FormControl('' , [Validators.required]),  
    // user : new FormControl('' , [Validators.required])  
  });
  
  articleForm = new FormGroup({  
    title : new FormControl('' , [Validators.required] ),
    date : new FormControl(this.myFormattedDate),  
    auteur : new FormControl('FivePoints'),  
    contenue : new FormControl('' , [Validators.required])  
  });

  ngOnInit(): void {

    this.userService.getUsersList().subscribe((response:any)=>{
      console.log(response)
        this.users = response;
    });

    this.categoryOptions = Object.keys(this.category);
    
  }

  ajouterFormation(){
    this.trainingService.createTraining(this.trainingForm.value).subscribe();
     console.log(this.trainingForm.value);
     this.router.navigate(['/accueilDashboard']);
   }

  ajouterArticle(){
    this.blogService.createBlog(this.articleForm.value).subscribe();
     console.log(this.articleForm.value);
     this.router.navigate(['/accueilDashboard']);
   }


}
