import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProductShowComponent } from './product-show/product-show.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { MentorRegistrationComponent } from './mentor-registration/mentor-registration.component';
import { HomeComponent } from './home/home.component';
import { MentorLandingComponent } from './mentor-landing/mentor-landing.component';
import { UserLandingComponent } from './user-landing/user-landing.component';
import { UserCurrentTrainingsComponent } from './user-current-trainings/user-current-trainings.component';
import { UserCompletedTrainingsComponent } from './user-completed-trainings/user-completed-trainings.component';
import { MentorProfileComponent } from './mentor-profile/mentor-profile.component';
import { MentorTrainingsComponent } from './mentor-trainings/mentor-trainings.component';
import { MentorPaymentsComponent } from './mentor-payments/mentor-payments.component';
import { SkillsignupComponent } from './skillsignup/skillsignup.component';

const routes: Routes = [
    {
        path: 'user-current-trainings',
        component: UserCurrentTrainingsComponent,
    },
    {
        path: 'skill-signup',
        component: SkillsignupComponent,
    },
    {
        path: '',
        component: HomeComponent,
    },
    {
        path: 'mentor-payments',
        component: MentorPaymentsComponent,
      
    },
    {
        path: 'mentor-trainings',
        component: MentorTrainingsComponent,
    },
    {
        path: 'user-completed-trainings',
        component: UserCompletedTrainingsComponent,
    },
    {
        path: 'mentor-profile',
        component: MentorProfileComponent,
    },
    {
        path: 'product-show',
        component: ProductShowComponent,
    },
    {
        path: 'user-landing',
        component: UserLandingComponent,
    },
    {
        path: 'user-registration',
        component: UserRegistrationComponent,
    },
    {
        path: 'mentor-registration',
        component: MentorRegistrationComponent,
    },
    {
        path: 'mentor-landing',
        component: MentorLandingComponent,
    },
    {
        path: 'home',
        component: HomeComponent,
    },
    {
        path: 'login',
        component: LoginComponent,
    },
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ],
    declarations: []
})
export class AppRoutingModule { }