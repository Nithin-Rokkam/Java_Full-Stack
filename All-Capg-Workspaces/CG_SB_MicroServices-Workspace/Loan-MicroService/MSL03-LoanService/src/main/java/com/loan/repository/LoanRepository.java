package com.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByCustomerId(Long customerId);

}
