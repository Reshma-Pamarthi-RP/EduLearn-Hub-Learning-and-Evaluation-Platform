import { Component, OnInit } from '@angular/core';
import { EmpService } from './../emp.service';

declare var jQuery: any;

@Component({
  selector: 'app-showemp',
  templateUrl: './showemp.component.html',
  styleUrls: ['./showemp.component.css']
})
export class ShowempComponent implements OnInit {

  employees: any;
  editObject: any;
  constructor(private service: EmpService) {
  // this.employees = [{empId: 100, empName: 'PASHA', gender: 'M', salary: 9999.99, doj: '1/21/99', mobile: '9891111111', country: 'INDIA'},
  // {empId: 101, empName: 'INDIRA', gender: 'F', salary: 9999.99, doj: '12/22/89', mobile: '9898888888', country: 'INDIA'},
  // {empId: 102, empName: 'VENKAT', gender: 'M', salary: 9999.99, doj: new Date(), mobile: '9897777777', country: 'UK'},
  // {empId: 103, empName: 'HARSHA', gender: 'M', salary: 9999.99, doj: '2/2/89', mobile: '9896666666', country: 'USA'}];

  this.editObject = {empId: '', empName: '', gender: '', salary: '' , doj: '', mobile: '', country: ''};
}

  ngOnInit() {
   this.service.getAllEmployees().subscribe((result: any) => { console.log(result); this.employees = result; });
  }

  deleteEmp(employee: any) {
    this.service.deleteEmp(employee).subscribe((result: any) => {
  const i = this.employees.findIndex((element) => {return element.empId === employee.empId;
      });
  this.employees.splice(i , 1);
    });
  }
  showEditPopup(employee: any) {
    this.editObject = employee;
    jQuery('#empModel').modal('show');
  }
  updateEmp() {
    this.service.updateEmp(this.editObject).subscribe();
    console.log(this.editObject);
  }
}
