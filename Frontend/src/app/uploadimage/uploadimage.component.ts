import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-uploadimage',
  templateUrl: './uploadimage.component.html',
  styleUrls: ['./uploadimage.component.css']
})
export class UploadimageComponent implements OnInit {

  imageUrl: string;
  fileToUpload: File = null;
  reader: FileReader;
  constructor(private service: StudentService) {
    this.imageUrl = '/assets/img/default-image.png';
  }

  ngOnInit() {
  }

  handleFileInput(file: FileList){
    this.fileToUpload = file.item(0);
    this.reader = new FileReader();
    this.reader.readAsDataURL(this.fileToUpload);
    this.reader.onload = (event: any) => {
      this.imageUrl = event.target.result;
    };
  }
  OnSubmit(imageForm: any) {
    console.log(imageForm);
    this.service.postFile(imageForm, this.fileToUpload).subscribe (
      data => {
        console.log('done');
        this.imageUrl = '/assets/Images/recipe.jpg';
      }
    );
  }


}

