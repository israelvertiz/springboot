package com.enhance.crm;

class EmployeeNotFoundException extends RuntimeException{

    EmployeeNotFoundException( Long id){
        super("Employee not found: "+id);
    }

}
