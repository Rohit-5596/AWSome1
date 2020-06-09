package com.ta.backend.service;

import org.springframework.stereotype.Service;

import com.ta.backend.entity.SkillSet;

@Service
public interface SkillService {
	
	public SkillSet addSkill(SkillSet skill);
}
