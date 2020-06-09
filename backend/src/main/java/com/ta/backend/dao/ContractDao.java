package com.ta.backend.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.backend.entity.EmploymentContract;

@Repository
@Transactional
public interface ContractDao extends JpaRepository<EmploymentContract, Integer>{

}
