import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmpService } from './../emp.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: any;
  constructor(private router: Router, private empService: EmpService) {
    this.user = {loginId: '', password: ''};
  }
  ngOnInit() {
  }
  // userLogin(): void {
  //   console.log('Inside user Login method...');
  //   console.log(this.user);
  // }

  loginSubmit(loginForm: any): void {
    if (loginForm.loginId === 'admin' && loginForm.password === 'admin') {
      this.empService.setUserLoggedIn();
      this.router.navigate(['products']);
    } else {
      alert('Invalid Credentials..');
    }
    console.log(loginForm);
  }

}
