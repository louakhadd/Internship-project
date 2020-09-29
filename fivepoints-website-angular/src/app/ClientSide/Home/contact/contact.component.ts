import { Component, OnInit, ViewChild } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ContactService } from "../../../services/contact.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
  @ViewChild('fform') feedbackFormDirective;

  constructor(private contactService: ContactService, private router: Router) { }

  contactForm = new FormGroup({  
    name : new FormControl('' , [Validators.required] ),
    subject : new FormControl('' , [Validators.required] ),  
    email : new FormControl('' , [Validators.required]),  
    contenuMessage : new FormControl('' , [Validators.required])  
  }); 

  ngOnInit(): void {
  }

  ajouterMessage(){
    this.contactService.sendMessage(this.contactForm.value).subscribe();
     console.log(this.contactForm.value);
    this.feedbackFormDirective.resetForm();
   }


}
