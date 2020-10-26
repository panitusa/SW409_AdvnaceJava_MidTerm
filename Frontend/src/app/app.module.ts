import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeMainComponent } from './employee-main/employee-main.component';
import {EmployeeService} from '../service/employee';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeMainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
