import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { EncrDecrService } from './encr-decr.service';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { Routes } from '@angular/router';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';
import { FormsModule } from '@angular/forms';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { HeaderComponent } from './header/header.component';
import { AuthGuard } from './auth.guard';
import { HomepageComponent } from './homepage/homepage.component';
import { UserComponent } from './user/user.component';
import { UploadimageComponent } from './uploadimage/uploadimage.component';
import { ShowDbimagesComponent } from './show-dbimages/show-dbimages.component';
//import { UploadImageComponent } from './upload-image/upload-image.component';
//import { ShowDbImagesComponent } from './show-db-images/show-db-images.component';
//import { GoogleLoginProvider, SocialAuthServiceConfig, SocialLoginModule } from 'angularx-social-login';

/*const appRoot: Routes = [
  {path: '',  component: StudentregistrationComponent },*/
const appRoot: Routes = [{path: '', component: HomepageComponent},
                         {path: 'studentlogin', component: StudentloginComponent},
                        {path: 'studentregistration', component: StudentregistrationComponent},
                        {path: 'homepage', component: HomepageComponent},
                        {path: 'user', component: UserComponent},
]


 

  
/*const google_oauth_client_id:string = "826765059204-b408c2n8lvh9v9u2a554rcmi78eujbj8.apps.googleusercontent.com";

let config = new SocialAuthServiceConfig([
  {
    id:GoogleLoginProvider.PROVIDER_ID,
    provider: new GoogleLoginProvider(google_oauth_client_id)

  }

  
])

export function provideConfig() {
  return config;
}*/

@NgModule({
  declarations: [
    AppComponent,
    StudentregistrationComponent,
    StudentloginComponent,
    HeaderComponent,
    HomepageComponent,
    UserComponent,
    UploadimageComponent,
    ShowDbimagesComponent,
    //UploadImageComponent,
    //ShowDbImagesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoot),
    //SocialLoginModule
  ],
  providers: [EncrDecrService],
  bootstrap: [AppComponent]
})
export class AppModule { }
