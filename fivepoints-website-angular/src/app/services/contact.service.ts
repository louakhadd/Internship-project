import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';

@Injectable()
export class ContactService {

  private baseUrl = 'http://localhost:8081/Contact';

  constructor(private http: HttpClient) { }

  onChangeContacts:BehaviorSubject<any>;

  getMessage(id: number){
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  getMessagesList() {
    return this.http.get(`${this.baseUrl}`);
  }

  sendMessage(message: Object) {
    return this.http.post(`${this.baseUrl}`, message);
  }

}
