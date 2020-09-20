import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';

@Injectable()
export class TrainingService {

  private baseUrl = 'http://localhost:8081/Trainings';
  
  onChangeTrainings:BehaviorSubject<any>;

  constructor(private http: HttpClient) {
    this.onChangeTrainings = new BehaviorSubject([])
   }
  getTraining(id: number){
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createTraining(training: Object) {
    return this.http.post(`${this.baseUrl}`, training);
  }

  updateTraining(id: number, value: any) {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteTraining(id: number) {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getTrainingsList() {
    return this.http.get(`${this.baseUrl}`);
  }

  getIntroDesc(id: number){
    return this.http.get(`${this.baseUrl}/intro/${id}`);
 };

 like(id: number){
  return this.http.get(`${this.baseUrl}/like/${id}`);
 };

}
