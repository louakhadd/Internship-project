import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RouterModule } from '@angular/router';
import { AppRoutes } from './app-routing';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { HeaderComponent } from './ClientSide/Home/header/header.component';
import { FooterComponent } from './ClientSide/Home/footer/footer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ArticleComponent } from './ClientSide/Blog/article/article.component';
import { BlogComponent } from './ClientSide/Blog/blog/blog.component';
import { SingleTrainingComponent } from './ClientSide/Trainings/single-training/single-training.component';
import { TrainingsComponent } from './ClientSide/Trainings/trainings/trainings.component';
import { TrainingRegistrationComponent } from './ClientSide/Trainings/training-registration/training-registration.component';

import { TrainingService } from './services/training.service';
import { BlogService } from './services/blog.service';
import { UserService } from './services/user.service';
import { CommentService } from './services/comment.service';
import { ContactService } from './services/contact.service';
import { TrainingRegistrationService } from './services/training-registration.service';
import { RegistrationService } from './services/registration.service';
import { TemplateComponent } from './ClientSide/Home/template/template.component';

import {MatFormFieldModule} from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatListModule} from '@angular/material/list';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {MatTableModule} from '@angular/material/table';
import {Ng2PageScrollModule} from 'ng2-page-scroll';
import { ServicesComponent } from './ClientSide/Consulting/services/services.component';
import { ServiceRegistrationComponent } from './ClientSide/Consulting/service-registration/service-registration.component';
import { ContactComponent } from './ClientSide/Home/contact/contact.component';
import { AccueilComponent } from './Dashboard/accueil/accueil.component';
import { LoginComponent } from './Dashboard/login/login.component';
import { RegisterComponent } from './Dashboard/register/register.component';
import { FormsComponent } from './Dashboard/forms/forms.component';
import { ProfilComponent } from './Dashboard/profil/profil.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ArticleComponent,
    BlogComponent,
    SingleTrainingComponent,
    TrainingsComponent,
    TrainingRegistrationComponent,
    TemplateComponent,
    ServicesComponent,
    ServiceRegistrationComponent,
    ContactComponent,
    AccueilComponent,
    LoginComponent,
    RegisterComponent,
    FormsComponent,
    ProfilComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    HttpClientModule,
    RouterModule.forRoot(AppRoutes),
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatListModule,
    MatSelectModule,
    MatIconModule,
    MatTableModule,
    Ng2PageScrollModule

  ],
  providers: [TrainingService, BlogService, UserService, ContactService,CommentService, TrainingRegistrationService, RegistrationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
