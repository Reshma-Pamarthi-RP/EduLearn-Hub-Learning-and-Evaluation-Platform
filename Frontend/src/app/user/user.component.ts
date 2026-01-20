import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  emailId: string

  constructor() { }

  ngOnInit(): void {
    this.emailId = localStorage.getItem("emailId");
  }

}
