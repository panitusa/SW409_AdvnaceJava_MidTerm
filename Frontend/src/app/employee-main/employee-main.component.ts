import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../service/employee';

@Component({
  selector: 'app-employee-main',
  templateUrl: './employee-main.component.html',
  styleUrls: ['./employee-main.component.css']
})
export class EmployeeMainComponent implements OnInit {

  constructor(private employeeService: EmployeeService) { }
  employees: [];
  ngOnInit(): void {
    this.employeeService.findAllEmployee()
      .then(employees => this.employees = employees);
  }

}
