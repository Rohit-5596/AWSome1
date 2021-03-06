package com.ta.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.backend.entity.Employer;
import com.ta.backend.entity.LabourerContract;
import com.ta.backend.entity.SkillSet;
import com.ta.backend.exception.EmployerException;
import com.ta.backend.service.ContractService;
import com.ta.backend.service.EmployerService;
import com.ta.backend.service.SkillService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/LabourMgm")
public class Controller {

	@Autowired
	EmployerService eService;
	
	@Autowired
	ContractService cService;
	
	@Autowired
	SkillService sService;
	
	
	@PostMapping(path = "/Employer/", consumes = "application/json")
	public Employer enterEmployer(@RequestBody Employer employer) throws EmployerException {

		if (eService.validatePincode(employer) && eService.validatePhoneNo(employer)) {
			employer.setStatus("Pending");
			System.out.println("Employer has a new record");
			return eService.addEmployer(employer);
		}
		return null;
	}

	@GetMapping(path = "/Employer/")
	public List<Employer> getAll() throws EmployerException {

		return eService.getEmployers();

	}

	@PutMapping(path = "/Employer/", consumes = "application/json")
	public Employer editEmployer(@RequestBody Employer employer) throws EmployerException {
		if (eService.validatePincode(employer) && eService.validatePhoneNo(employer)) {
			System.out.println("Employer " + employer.getEmployerId() + " has an updated record");
			return eService.editEmployer(employer);
		}
		return null;
	}

	@GetMapping(path = "/Employer/{employerId}")
	public Employer getEmployerById(@PathVariable int employerId) {
		return eService.getEmployer(employerId);
	}
	
	@DeleteMapping(path="/Employer/{employerId}")
	public void deleteEmployer(@PathVariable int employerId)
	{
		eService.deleteEmployer(employerId);
	}
	
	
	/*======================================================================================*/
	@PostMapping(path = "/Contract/", consumes = "application/json")
	public LabourerContract enterContract(@RequestBody LabourerContract empContract) throws EmployerException {

		if (cService.validateWage(empContract) && cService.validateDate(empContract)) {
			System.out.println("EmployerContract has a new record");
			return cService.addContract(empContract);
		}
		System.out.println("EmployerContract has no new record");
		return null;
	}
	

	@GetMapping(path = "/Contract/")
	public List<LabourerContract> getAllPendingContracts() throws EmployerException {

		System.out.println("Pending contracts");
		return cService.fetchAllPending();

	}
	
	@GetMapping(path="/Contract/{id}")
	public LabourerContract viewContractById(@PathVariable int id) {
		LabourerContract contract = new LabourerContract();
		contract= cService.viewById(id);
		if(contract==null) {
			System.out.println(id+" not found");
			return null;
		}
		System.out.println(id+ " found");
		return contract;
	}
	
	

	
	/*======================================================================================*/
	
	
	@PostMapping(path = "/Skill/", consumes = "application/json")
	public SkillSet enterSkill(@RequestBody SkillSet skill) throws EmployerException {

			System.out.println("SkillSet has a new record");
			return sService.addSkill(skill);
	}
	
	@GetMapping(path = "/Skill/{id}")
	public SkillSet getSkilById(@PathVariable int id) {
		return cService.viewSkillById(id);
	}

}
