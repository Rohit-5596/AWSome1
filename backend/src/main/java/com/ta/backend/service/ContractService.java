package com.ta.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ta.backend.entity.LabourerContract;
import com.ta.backend.entity.SkillSet;

@Service
public interface ContractService {
	
	public boolean validateDate(LabourerContract empContract);
	
	public boolean validateWage(LabourerContract empContract);

	public LabourerContract addContract(LabourerContract empContract);
	
	public SkillSet viewSkillById(int id);
	
	public List<LabourerContract> fetchAllPending();
	
	public LabourerContract viewById(int id);

}
