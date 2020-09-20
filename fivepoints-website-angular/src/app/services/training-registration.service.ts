import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable()
export class TrainingRegistrationService {

  private baseUrl = 'http://localhost:8081/TrainingRegistration';

  constructor(private http: HttpClient) { }

  Register(reg: Object) {
    return this.http.post(`${this.baseUrl}`, reg);
  }
}
