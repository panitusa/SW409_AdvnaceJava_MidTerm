import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EmployeeMainComponent} from './employee-main/employee-main.component';


const routes: Routes = [
  {path: 'employee', component: EmployeeMainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
