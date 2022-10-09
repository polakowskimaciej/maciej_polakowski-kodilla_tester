package com.kodilla.hibernate.financialtasks.repository;

import com.kodilla.hibernate.financialtasks.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {
List<TaskFinancialDetails> findByBooleanPaid(boolean paid);
}
