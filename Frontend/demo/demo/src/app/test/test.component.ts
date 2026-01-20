import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  age: number;
  name: string;
  isEmployee: boolean;
  hobbies: any;
  address: any;
  message: string;
  constructor() {
    this.age = 35;
    this.name = 'SACHIN';
    this.isEmployee = true;
    this.hobbies = ['sleeping' , 'eating', 'tik tok', 'chatting'];
    this.address = {doorNo: '10-10/A', street: 'BACHUPALLY', city: 'HYDERABAD'};
  }
  ngOnInit() {
  }
  showMessage(): void {
    alert('show is executed...');
    console.log(this.message);
  }
}

