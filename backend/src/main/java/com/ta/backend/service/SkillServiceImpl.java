package com.ta.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.backend.dao.SkillDao;
import com.ta.backend.entity.SkillSet;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	SkillDao sDao;

	@Override
	public SkillSet addSkill(SkillSet skill) {
		return sDao.save(skill);
	}
	
	

}
