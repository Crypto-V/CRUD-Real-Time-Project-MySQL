package com.cripyV.springboot.cruddemo.dao;

import com.cripyV.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
