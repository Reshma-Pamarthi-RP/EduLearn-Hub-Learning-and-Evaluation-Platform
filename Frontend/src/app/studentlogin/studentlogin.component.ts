import { ViewChild } from '@angular/core';
import { ElementRef } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EncrDecrService } from '../encr-decr.service';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent implements OnInit {
  
  loginform: any;
  retrivedData : any;
  emailId: any;
  @ViewChild('loginRef', {static: true }) loginElement: ElementRef;
  show: boolean;
  //auth2: gapi.auth2.GoogleAuth;
  Name: any;
  auth2: gapi.auth2.GoogleAuth;
  //password: any;
  constructor(private router: Router, private service : StudentService) {
    this.loginform = {emailId : '', password : ''};
    
    
    
   }

  ngOnInit(): void {
      //this.pass = 
      /*var encrypted = this.EncrDecr.set('123456$#@$^@1ERF','');
      var decrypted = this.EncrDecr.get('123456$#@$^@1ERF', encrypted);
     
      console.log('Encrypted :' + encrypted);
      console.log('Decrypted :' + decrypted);
    */
    this.googleInitialize();   
  }
  googleInitialize() {
    window['googleSDKLoaded'] = () => {
      window['gapi'].load('auth2', () => {
        this.auth2 = window['gapi'].auth2.init({
          client_id: '826765059204-b408c2n8lvh9v9u2a554rcmi78eujbj8.apps.googleusercontent.com',
          cookie_policy: 'single_host_origin',
          scope: 'profile email'
        });
        this.prepareLogin();
      });
    }
    (function(d, s, id){
      var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) {return;}
      js = d.createElement(s); js.id = id;
      js.src = "https://apis.google.com/js/platform.js?onload=googleSDKLoaded";
      fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'google-jssdk'));
  }

  prepareLogin() {
    this.auth2.attachClickHandler(this.loginElement.nativeElement, {},
      (googleUser) => {
        let profile = googleUser.getBasicProfile();
        console.log('Token || ' + googleUser.getAuthResponse().id_token);
        this.show = true;
        this.Name =  profile.getName();
        //this.pass= profile.getPassword();
        console.log(this.Name)
        console.log('Image URL: ' + profile.getImageUrl());
        console.log('Email: ' + profile.getEmail());
        this.router.navigate(['user']);
      }, (error) => {
        alert(JSON.stringify(error, undefined, 2));
      });
     
  }
  


getStudentByUserPass() {
    this.service.getStudentByUserPass(this.loginform).subscribe((result: any) => {console.log(result); this.retrivedData = result;
    if(this.retrivedData === null){
      alert("Wrong Credentials");
    }
    else {
      alert("Logged in");
      //console.log(this.loginform.password)
      //var encrypted = this.EncrDecr.set('123456$#@$^@1ERF',this.loginform.password);
      //var decrypted = this.EncrDecr.get('123456$#@$^@1ERF', encrypted);
     
      //console.log('Encrypted :' + encrypted);
      //console.log('Decrypted :' + decrypted);
      localStorage.setItem('emailId', this.loginform.emailId);
      this.router.navigate(['user']);
    }
  });
}
}
