import { Component, OnInit } from '@angular/core';
import { ContactService } from "../../services/contact.service";
import { BlogService } from "../../services/blog.service";
import { contact } from "../../entities/contact";
import { Blog } from "../../entities/blog";
import { Router } from '@angular/router';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {
  contacts: any;
  contact: contact;
  blog: Blog;
  blogs: any;

  constructor(private contactService: ContactService,private blogService: BlogService,
    private router: Router) { }

  ngOnInit() {
    this.contacts = this.contactService.getMessagesList()
      .subscribe(
        data => {
          console.log(data);
          this.contacts();
        },)


    this.blogs = this.blogService.getBlogsList()
    .subscribe(
      data => {
        console.log(data);
        this.blogs();
      },)


  }


}
