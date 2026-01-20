import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  //emailId : String

  constructor() { }

  ngOnInit(): void {
    //this.emailId = localStorage.getItem("emailId");
  }

}
