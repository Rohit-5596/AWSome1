package com.ta.backend.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.backend.entity.SkillSet;

@Repository
@Transactional
public interface SkillDao extends JpaRepository<SkillSet, Integer> {

}
