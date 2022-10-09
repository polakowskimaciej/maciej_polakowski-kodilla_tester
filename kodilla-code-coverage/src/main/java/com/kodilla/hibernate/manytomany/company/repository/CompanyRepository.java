package com.kodilla.hibernate.manytomany.company.repository;

import com.kodilla.hibernate.manytomany.company.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Integer> {
List<Company> findByName(String name);
}
