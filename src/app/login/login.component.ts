import { Component, OnInit } from '@angular/core';
import { userlogin } from '../userlogin.model';
import { usermain } from '../usermain.model';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //constructor() { }

  ngOnInit() {
  }
  userlogin: userlogin=new userlogin();
  userinfo: usermain=new usermain();
  userlogin1: usermain=new usermain();
  constructor(private router: Router, private userService: UserService) {

  }

  createUser(): void {
    console.log('scope ');
   this.userService.loginaa(this.userlogin)
        .subscribe( (data) => {
         
        this.userlogin1=data;
          
          localStorage.setItem('userinfo', JSON.stringify(this.userlogin1));
          
          if(this.userlogin1.active==1)
          {
            this.router.navigate(['user-landing']);
          }
          else{
            this.router.navigate(['']);
          }

        });
      };
  

}
