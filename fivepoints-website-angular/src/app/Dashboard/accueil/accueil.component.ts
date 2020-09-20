import { Component, OnInit } from '@angular/core';
import { ContactService } from "../../services/contact.service";
import { contact } from "../../entities/contact";
import { Router } from '@angular/router';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {
  contacts: any;
  contact: contact;

  constructor(private contactService: ContactService,
    private router: Router) { }

  ngOnInit() {
    this.contacts = this.contactService.getMessagesList()
      .subscribe(
        data => {
          console.log(data);
          this.contacts();
        },)

  }


}
