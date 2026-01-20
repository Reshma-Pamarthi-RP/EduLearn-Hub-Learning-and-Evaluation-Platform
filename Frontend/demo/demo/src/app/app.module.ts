import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { LoginComponent } from './login/login.component';
import { ShowempComponent } from './showemp/showemp.component';
import { ExperiencePipe } from './experience.pipe';
import { GenderPipe } from './gender.pipe';
import { MobilePipe } from './mobile.pipe';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ProductsComponent } from './products/products.component';

import { AuthGuard } from './auth.guard';
import { EmpbyidComponent } from './empbyid/empbyid.component';

const appRoot: Routes = [{path: '', component: LoginComponent},
                         {path: 'login', component: LoginComponent},
                        {path: 'register', canActivate: [AuthGuard], component: RegisterComponent},
                        {path: 'showemp', canActivate: [AuthGuard], component: ShowempComponent},
                        {path: 'products', canActivate: [AuthGuard], component: ProductsComponent},
                        {path: 'empbyid', canActivate: [AuthGuard], component: EmpbyidComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    LoginComponent,
    ShowempComponent,
    ExperiencePipe,
    GenderPipe,
    MobilePipe,
    RegisterComponent,
    HeaderComponent,
    FooterComponent,
    ProductsComponent,
    EmpbyidComponent
  ],
  imports: [

BrowserModule, FormsModule, HttpClientModule, RouterModule.forRoot(appRoot)
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
