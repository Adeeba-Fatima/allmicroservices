import { Component, OnInit } from '@angular/core';
import { user } from '../user.model';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent implements OnInit {

 // constructor() { }

  ngOnInit() {
  }

  user: user=new user();
  constructor(private router: Router, private userService: UserService) {

  }
  
  createUser(): void {
    console.log('scope ');
   this.userService.createUser(this.user)
        .subscribe( (data) => {
          alert("User created successfully.");
        
          this.router.navigate(['']);
        });
      };

}
