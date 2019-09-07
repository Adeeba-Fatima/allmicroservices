import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { ProductShowComponent } from './product-show/product-show.component';
import { LoginComponent } from './login/login.component';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app.routing.module';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { MentorRegistrationComponent } from './mentor-registration/mentor-registration.component';
import { HomeComponent } from './home/home.component';
import { MentorLandingComponent } from './mentor-landing/mentor-landing.component';
import { UserLandingComponent } from './user-landing/user-landing.component';
import { MentorProfileComponent } from './mentor-profile/mentor-profile.component';
import { UserCurrentTrainingsComponent } from './user-current-trainings/user-current-trainings.component';
import { UserCompletedTrainingsComponent } from './user-completed-trainings/user-completed-trainings.component';
import { MentorPaymentsComponent } from './mentor-payments/mentor-payments.component';
import { MentorTrainingsComponent } from './mentor-trainings/mentor-trainings.component';
import { SkillsignupComponent } from './skillsignup/skillsignup.component';
import { SkillService } from './skill.service';
import { from } from 'rxjs';
import {FormsModule} from '@angular/forms';
import { MentorloginComponent } from './mentorlogin/mentorlogin.component';
import { UserService } from './user.service';
import { MentorService } from './mentor.service';








@NgModule({
  declarations: [
    AppComponent,
    ProductShowComponent,
    LoginComponent,
    UserRegistrationComponent,
    MentorRegistrationComponent,
    HomeComponent,
    MentorLandingComponent,
    UserLandingComponent,
    MentorProfileComponent,
    UserCurrentTrainingsComponent,
    UserCompletedTrainingsComponent,
    MentorPaymentsComponent,
    MentorTrainingsComponent,
    SkillsignupComponent,
    MentorloginComponent


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  
  ],
  providers: [SkillService, UserService,MentorService
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
