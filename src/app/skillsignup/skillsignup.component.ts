import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { skill } from '../skill.model';
import { SkillService } from '../skill.service';
import { routerNgProbeToken } from '@angular/router/src/router_module';




@Component({
  selector: 'app-skillsignup',
  templateUrl: './skillsignup.component.html',
  styleUrls: ['./skillsignup.component.css']
})
export class SkillsignupComponent implements OnInit {

 // constructor() { }

  ngOnInit() {
  }
  skill: skill=new skill();
  skill1: skill=new skill();
  skill2: skill=new skill();
  constructor(private router: Router, private userService: SkillService) {

  }
  createUser(): void {
    console.log('scope ');
   this.userService.createUser(this.skill)
        .subscribe( (data) => {
          alert("User created successfully.");
          this.skill1=data;
          console.log("skill.name");
          console.log(this.skill1.name);
          localStorage.setItem('dataSource', JSON.stringify(this.skill1));
          this.skill2 = JSON.parse(localStorage.getItem('dataSource'));
        });
   
     

  };

}
