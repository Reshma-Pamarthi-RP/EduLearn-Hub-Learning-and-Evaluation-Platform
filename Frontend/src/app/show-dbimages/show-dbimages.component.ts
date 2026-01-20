import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-show-dbimages',
  templateUrl: './show-dbimages.component.html',
  styleUrls: ['./show-dbimages.component.css']
})
export class ShowDbimagesComponent implements OnInit {

  materials: any;

  constructor(private service: StudentService) { }

  ngOnInit() {
    this.service.getMaterials().subscribe( (result: any) => {console.log(result); this.materials = result; });
  }

}
