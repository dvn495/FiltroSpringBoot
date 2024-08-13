package com.examenfiltro.examenfiltro.customer.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examenfiltro.examenfiltro.customer.domain.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
