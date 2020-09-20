import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class UserService {

  private baseUrl = 'http://localhost:8081/Users';

  constructor(private http: HttpClient) { }

  getUser(id: number){
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createUser(user: Object) {
    return this.http.post(`${this.baseUrl}`, user);
  }

  updateUser(id: number, value: any) {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteUser(id: number) {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getUsersList() {
    return this.http.get(`${this.baseUrl}`);
  }
}
