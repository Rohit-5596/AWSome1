package com.ta.backend.service;

import org.springframework.stereotype.Service;

import com.ta.backend.entity.EmploymentContract;
import com.ta.backend.entity.SkillSet;

@Service
public interface ContractService {
	
	public EmploymentContract addContract(EmploymentContract empContract);

	public boolean validateDate(EmploymentContract empContract);
	
	public SkillSet viewSkillById(int id);

}
