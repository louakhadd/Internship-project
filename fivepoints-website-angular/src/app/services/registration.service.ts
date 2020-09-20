import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable()
export class RegistrationService {

  private baseUrl = 'http://localhost:8081/ServiceRegistration';

  constructor(private http: HttpClient) { }

  Register(reg: Object) {
    return this.http.post(`${this.baseUrl}`, reg);
  }
}
