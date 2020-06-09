package com.ta.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.backend.dao.ContractDao;
import com.ta.backend.dao.SkillDao;
import com.ta.backend.entity.Employer;
import com.ta.backend.entity.EmploymentContract;
import com.ta.backend.entity.SkillSet;

@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired 
	ContractDao cDao;
	
	@Autowired
	SkillDao sDao;

	@Override
	public boolean validateDate(EmploymentContract empContract){
		if (empContract.getCreationDate()!=null && empContract.getLastModifiedDate()!=null && empContract.getLastModifiedDate().after(empContract.getCreationDate()))
		 {
			 return true;
		 }
		return false;
	}

	
	@Override
	public SkillSet viewSkillById(int id) {
     Optional<SkillSet> result = sDao.findById(id);
		
		SkillSet skill = null;
		
		if(result.isPresent())
		{
			skill = result.get();
		}
		
		return skill;	
	}
	
	
	@Override
	public EmploymentContract addContract(EmploymentContract empContract) {
		
		return cDao.save(empContract);
	}




}
