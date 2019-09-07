import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { user } from './user.model';
import { userlogin } from './userlogin.model';

import {map} from 'rxjs/operators';
import { Observable } from 'rxjs';

const user_endpoint='http://localhost:7676/user/register';
const userlogin_endpoint='http://localhost:7676/user/login';
const httpOptions={
  headers: new HttpHeaders({
      'Content-Type' : 'application/json'
  })
};
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  
  private extractData(res : Response){
    let contents=res;
    //check if contents are not null
    return contents || { };
  }
createUser(user: user):Observable<any>{

  return this.http.post(user_endpoint,JSON.stringify(user),httpOptions).pipe(map(this.extractData))

}

loginaa(userlogin: userlogin):Observable<any>{

  return this.http.post(userlogin_endpoint,JSON.stringify(userlogin),httpOptions).pipe(map(this.extractData))

}




}
