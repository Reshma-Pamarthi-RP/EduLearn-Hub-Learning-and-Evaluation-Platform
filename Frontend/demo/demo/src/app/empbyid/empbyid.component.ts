import { Component, OnInit } from '@angular/core';
import { EmpService } from './../emp.service';

@Component({
  selector: 'app-empbyid',
  templateUrl: './empbyid.component.html',
  styleUrls: ['./empbyid.component.css']
})
export class EmpbyidComponent implements OnInit {
employee: any;
empId: any;
  constructor(private service: EmpService) { }

  ngOnInit() {
    }
getEmpById() {
this.service.getEmpById(this.empId).subscribe((result: any) => {console.log(result); this.employee = result; });
}
}
