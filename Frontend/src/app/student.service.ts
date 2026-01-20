import { Injectable } from '@angular/core';
import { HttpClient } from  '@angular/common/http';
import { Observable } from 'rxjs';
import { retry } from 'rxjs/operators';
import { Subject } from 'rxjs';


@Injectable({
    providedIn: 'root'

})

export class StudentService {
  getMaterials() {
    throw new Error('Method not implemented.');
  }
  
  postFile(imageForm: any, fileToUpload: File) {
    const formData: FormData = new FormData();
      formData.append('Image', fileToUpload, fileToUpload.name);
      formData.append('productName', imageForm.productName);
      formData.append('description', imageForm.description);
      formData.append('price', imageForm.price);
  
      return this.httpClient.post('RestAPI/webapi/myresource/uploadImage', formData);
    throw new Error('Method not implemented.');
  } 
    private isUserLogged: any;
    constructor(private httpClient: HttpClient) {
    this.isUserLogged = false;
   }
   setUserLoggedIn(): void { // login success
    this.isUserLogged = true;
   }
   setUserLoggedOut(): void { // logout success
    this.isUserLogged = false;
   }

   getUserLogged(): any { // call this in AuthGuard
    return this.isUserLogged;
  }

    registerStudent(student: any) {
        console.log(student);
        return this.httpClient.post('RESTAPI_Q2L/webapi/myresource/registerStudent', student);
     }

     getStudentByUserPass(loginform : any){
        console.log(loginform);
        return this.httpClient.get('RESTAPI_Q2L/webapi/myresource/getStudentByUserPass/'+ loginform.emailId + '/' + loginform.password);
     }

    getProducts() {
    return this.httpClient.get('RestAPI_Q2L/webapi/myresource/getMaterials');
   }
      
       
    


}