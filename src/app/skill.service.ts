import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { skill } from './skill.model';

import {map} from 'rxjs/operators';
import { Observable } from 'rxjs';

const skill_endpoint='http://localhost:6769/slow/reg';
const httpOptions={
  headers: new HttpHeaders({
      'Content-Type' : 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  constructor(private http: HttpClient) { }

  private extractData(res : Response){
    let contents=res;
    //check if contents are not null
    return contents || { };
  }
createUser(skill: skill):Observable<any>{

  return this.http.post(skill_endpoint,JSON.stringify(skill),httpOptions).pipe(map(this.extractData))

}

}
