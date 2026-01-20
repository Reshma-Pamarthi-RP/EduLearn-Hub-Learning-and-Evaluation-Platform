import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EncrDecrService } from '../encr-decr.service';
//import { EncrDecrService } from '../encr-decr.service';
import { StudentService } from '../student.service';


@Component({
  selector: 'app-studentregistration',
  templateUrl: './studentregistration.component.html',
  styleUrls: ['./studentregistration.component.css']
})
export class StudentregistrationComponent implements OnInit {
  student: any;
    constructor(private router: Router, private service: StudentService,private EncrDecr: EncrDecrService ){
        this.student = {studentId: '', studentFirstName: '', studentLastName: '', password: '', emailId: '', institution: '', standard: ''};
    } 
     
    ngOnInit(): void {
    var encrypted = this.EncrDecr.set('123456$#@$^@1ERF', this.student.password);
      this.student.password = encrypted.toString();
      console.log(this.student.password);
      var decrypted = this.EncrDecr.get('123456$#@$^@1ERF', encrypted);
     
      console.log('Encrypted :' + encrypted);
      console.log('Decrypted :' + decrypted);
      
    }
  

    register(): void {
        
        this.service.registerStudent(this.student).subscribe((result: any) => {this.router.navigate(['studentlogin']); } );
        console.log(this.student);
    }

}

  