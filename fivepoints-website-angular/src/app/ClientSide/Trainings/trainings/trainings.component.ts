import { TrainingService } from "../../../services/training.service";
import { Training } from "../../../entities/training";
import { Component, OnInit, OnDestroy } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: "app-trainings",
  templateUrl: "./trainings.component.html",
  styleUrls: ["./trainings.component.css"]
})
export class TrainingsComponent implements OnInit , OnDestroy {
  trainings: Training[];
  training: Training;

  constructor(private trainingService: TrainingService,
    private router: Router) {}

    //life cycle hooks
  ngOnDestroy(): void {
    console.log('destroy training')
  }

  ngOnInit() {

    this.trainingService.getTrainingsList().subscribe((response:any)=>{
      this.trainingService.onChangeTrainings.next(response)
   });;

    this.trainingService.onChangeTrainings.subscribe((data:any)=>{
      console.log('dataaa',data);
        this.trainings = data;
        this.trainings.map(blog => {
          this.trainingService.getIntroDesc(blog.id).subscribe((res: any) => {
            blog['subtitle'] = res.jsonString;
          });
        });
    });

  }

 trainingDetails(id: number){
    this.router.navigate(['singleTraining', id]);
  }

  onClickMe(id:number){
    this.trainingService.like(id).subscribe((response:any)=>{
      this.trainingService.onChangeTrainings.next(response)
   });;
  }


}