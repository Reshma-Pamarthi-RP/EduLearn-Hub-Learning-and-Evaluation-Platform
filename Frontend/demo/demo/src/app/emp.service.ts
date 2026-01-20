import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmpService {
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
   getCountriesList(): any {
    return this.httpClient.get('https://restcountries.eu/rest/v2/all');
   }
   getAllEmployees(): any {
    return this.httpClient.get('RestAPI/webapi/myresource/getAllEmployees');
   }
   getEmpById(empId: any) {
    return this.httpClient.get('RestAPI/webapi/myresource/getEmployeeById/' + empId);
   }
   registerEmp(employee: any) {
    return this.httpClient.post('RestAPI/webapi/myresource/registerEmp/',  employee);
   }
   deleteEmp(employee: any) {
    return this.httpClient.delete('RestAPI/webapi/myresource/deleteEmp/' + employee.empId);
   }

   updateEmp(editObject: any) {
    return this.httpClient.put('RESTAPI/webapi/myresource/updateEmp', editObject);
   }

   getAllDepartments(): any {
    return this.httpClient.get('RestAPI/webapi/myresource/getDepartments');
   }
   

}

