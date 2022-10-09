package com.kodilla.hibernate.manytomany.employee.repository;

import com.kodilla.hibernate.manytomany.employee.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByFirstName(String firstname);
}
