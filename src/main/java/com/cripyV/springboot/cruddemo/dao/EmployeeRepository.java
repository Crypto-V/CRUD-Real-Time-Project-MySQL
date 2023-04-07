package com.cripyV.springboot.cruddemo.dao;

import com.cripyV.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Modify the path using @RepositoryRestResource(path = "members"), the new path will be /members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Integer is the primaryKey datatype
    //Employee is the class we want to create JPA for.

    //There is no code anymore.
}
