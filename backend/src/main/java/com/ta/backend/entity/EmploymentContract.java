package com.ta.backend.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@SequenceGenerator(name = "seq_contract", initialValue=30001)
@Table(name="contract_data")
public class EmploymentContract {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_contract")
	@Column(name="contract_id",length = 5)
	private int employerId;
	
	@NotNull
	@Column(name="employment_start_date", length=15)
	private Date emplymentStartDate;
	
	@NotNull
	@Column(name="employment_end_date", length=15)
	private Date emplymentEndDate;
	
	@NotNull
	@Column(name="employment_city", length=10)
	private String employmentCity;
	
	@NotNull
	@Column(name="employment_state", length=15)
	private String employmentState;
	
	@NotNull
	@Column(name="total_no_of_labourer_needed", length=4)
	private int totalNoOfLabourerNeeded;
	
	@NotNull
	@Column(name="skillset1", length=2)
	private int skillset1;
	
	@NotNull
	@Column(name="labourer_needed_skillset1", length=4)
	private int labourerNeededSkillset1;
	
	@NotNull
	@Column(name="min_daily_wage_skillset1", length=4)
	private int minDailyWageSkillset1;
	
	@NotNull
	@Column(name="daily_wage_skillset1", length=4)
	private int dailyWageSkillset1;
	
	@NotNull
	@Column(name="skillset2", length=2)
	private int skillset2;
	
	@NotNull
	@Column(name="labourer_needed_skillset2", length=4)
	private int labourerNeededSkillset2;
	
	@NotNull
	@Column(name="min_daily_wage_skillset2", length=4)
	private int minDailyWageSkillset2;
	
	@NotNull
	@Column(name="daily_wage_skillset2", length=4)
	private int dailyWageSkillset2;
	
	@NotNull
	@Column(name="skillset3", length=2)
	private int skillset3;
	
	@NotNull
	@Column(name="labourer_needed_skillset3", length=4)
	private int labourerNeededSkillset3;
	
	@NotNull
	@Column(name="min_daily_wage_skillset3", length=4)
	private int minDailyWageSkillset3;
	
	@NotNull
	@Column(name="daily_wage_skillset3", length=4)
	private int dailyWageSkillset3;
	
	@NotNull
	@Column(name="medical_insurance_cover", length=15)
	private String medicalInsuranceCover;
	
	@NotNull
	@Column(name="status", length=10)
	private String status;
	
	@Column(name="creation_date", columnDefinition = "TIMESTAMP")
	@CreationTimestamp
	private Timestamp creationDate;
	
	@Column(name="last_modified_date", columnDefinition = "TIMESTAMP")
    @UpdateTimestamp
	private Timestamp lastModifiedDate;

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public Date getEmplymentStartDate() {
		return emplymentStartDate;
	}

	public void setEmplymentStartDate(Date emplymentStartDate) {
		this.emplymentStartDate = emplymentStartDate;
	}

	public Date getEmplymentEndDate() {
		return emplymentEndDate;
	}

	public void setEmplymentEndDate(Date emplymentEndDate) {
		this.emplymentEndDate = emplymentEndDate;
	}

	public String getEmploymentCity() {
		return employmentCity;
	}

	public void setEmploymentCity(String employmentCity) {
		this.employmentCity = employmentCity;
	}

	public String getEmploymentState() {
		return employmentState;
	}

	public void setEmploymentState(String employmentState) {
		this.employmentState = employmentState;
	}

	public int getTotalNoOfLabourerNeeded() {
		return totalNoOfLabourerNeeded;
	}

	public void setTotalNoOfLabourerNeeded(int totalNoOfLabourerNeeded) {
		this.totalNoOfLabourerNeeded = totalNoOfLabourerNeeded;
	}

	public int getSkillset1() {
		return skillset1;
	}

	public void setSkillset1(int skillset1) {
		this.skillset1 = skillset1;
	}

	public int getLabourerNeededSkillset1() {
		return labourerNeededSkillset1;
	}

	public void setLabourerNeededSkillset1(int labourerNeededSkillset1) {
		this.labourerNeededSkillset1 = labourerNeededSkillset1;
	}

	public int getMinDailyWageSkillset1() {
		return minDailyWageSkillset1;
	}

	public void setMinDailyWageSkillset1(int minDailyWageSkillset1) {
		this.minDailyWageSkillset1 = minDailyWageSkillset1;
	}

	public int getDailyWageSkillset1() {
		return dailyWageSkillset1;
	}

	public void setDailyWageSkillset1(int dailyWageSkillset1) {
		this.dailyWageSkillset1 = dailyWageSkillset1;
	}

	public int getSkillset2() {
		return skillset2;
	}

	public void setSkillset2(int skillset2) {
		this.skillset2 = skillset2;
	}

	public int getLabourerNeededSkillset2() {
		return labourerNeededSkillset2;
	}

	public void setLabourerNeededSkillset2(int labourerNeededSkillset2) {
		this.labourerNeededSkillset2 = labourerNeededSkillset2;
	}

	public int getMinDailyWageSkillset2() {
		return minDailyWageSkillset2;
	}

	public void setMinDailyWageSkillset2(int minDailyWageSkillset2) {
		this.minDailyWageSkillset2 = minDailyWageSkillset2;
	}

	public int getDailyWageSkillset2() {
		return dailyWageSkillset2;
	}

	public void setDailyWageSkillset2(int dailyWageSkillset2) {
		this.dailyWageSkillset2 = dailyWageSkillset2;
	}

	public int getSkillset3() {
		return skillset3;
	}

	public void setSkillset3(int skillset3) {
		this.skillset3 = skillset3;
	}

	public int getLabourerNeededSkillset3() {
		return labourerNeededSkillset3;
	}

	public void setLabourerNeededSkillset3(int labourerNeededSkillset3) {
		this.labourerNeededSkillset3 = labourerNeededSkillset3;
	}

	public int getMinDailyWageSkillset3() {
		return minDailyWageSkillset3;
	}

	public void setMinDailyWageSkillset3(int minDailyWageSkillset3) {
		this.minDailyWageSkillset3 = minDailyWageSkillset3;
	}

	public int getDailyWageSkillset3() {
		return dailyWageSkillset3;
	}

	public void setDailyWageSkillset3(int dailyWageSkillset3) {
		this.dailyWageSkillset3 = dailyWageSkillset3;
	}

	public String getMedicalInsuranceCover() {
		return medicalInsuranceCover;
	}

	public void setMedicalInsuranceCover(String medicalInsuranceCover) {
		this.medicalInsuranceCover = medicalInsuranceCover;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public EmploymentContract(int employerId, @NotNull Date emplymentStartDate, @NotNull Date emplymentEndDate,
			@NotNull String employmentCity, @NotNull String employmentState, @NotNull int totalNoOfLabourerNeeded,
			@NotNull int skillset1, @NotNull int labourerNeededSkillset1, @NotNull int minDailyWageSkillset1,
			@NotNull int dailyWageSkillset1, @NotNull int skillset2, @NotNull int labourerNeededSkillset2,
			@NotNull int minDailyWageSkillset2, @NotNull int dailyWageSkillset2, @NotNull int skillset3,
			@NotNull int labourerNeededSkillset3, @NotNull int minDailyWageSkillset3, @NotNull int dailyWageSkillset3,
			@NotNull String medicalInsuranceCover, @NotNull String status, Timestamp creationDate,
			Timestamp lastModifiedDate) {
		super();
		this.employerId = employerId;
		this.emplymentStartDate = emplymentStartDate;
		this.emplymentEndDate = emplymentEndDate;
		this.employmentCity = employmentCity;
		this.employmentState = employmentState;
		this.totalNoOfLabourerNeeded = totalNoOfLabourerNeeded;
		this.skillset1 = skillset1;
		this.labourerNeededSkillset1 = labourerNeededSkillset1;
		this.minDailyWageSkillset1 = minDailyWageSkillset1;
		this.dailyWageSkillset1 = dailyWageSkillset1;
		this.skillset2 = skillset2;
		this.labourerNeededSkillset2 = labourerNeededSkillset2;
		this.minDailyWageSkillset2 = minDailyWageSkillset2;
		this.dailyWageSkillset2 = dailyWageSkillset2;
		this.skillset3 = skillset3;
		this.labourerNeededSkillset3 = labourerNeededSkillset3;
		this.minDailyWageSkillset3 = minDailyWageSkillset3;
		this.dailyWageSkillset3 = dailyWageSkillset3;
		this.medicalInsuranceCover = medicalInsuranceCover;
		this.status = status;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public EmploymentContract() {
		super();
	}

	@Override
	public String toString() {
		return "EmploymentContract [employerId=" + employerId + ", emplymentStartDate=" + emplymentStartDate
				+ ", emplymentEndDate=" + emplymentEndDate + ", employmentCity=" + employmentCity + ", employmentState="
				+ employmentState + ", totalNoOfLabourerNeeded=" + totalNoOfLabourerNeeded + ", skillset1=" + skillset1
				+ ", labourerNeededSkillset1=" + labourerNeededSkillset1 + ", minDailyWageSkillset1="
				+ minDailyWageSkillset1 + ", dailyWageSkillset1=" + dailyWageSkillset1 + ", skillset2=" + skillset2
				+ ", labourerNeededSkillset2=" + labourerNeededSkillset2 + ", minDailyWageSkillset2="
				+ minDailyWageSkillset2 + ", dailyWageSkillset2=" + dailyWageSkillset2 + ", skillset3=" + skillset3
				+ ", labourerNeededSkillset3=" + labourerNeededSkillset3 + ", minDailyWageSkillset3="
				+ minDailyWageSkillset3 + ", dailyWageSkillset3=" + dailyWageSkillset3 + ", medicalInsuranceCover="
				+ medicalInsuranceCover + ", status=" + status + ", creationDate=" + creationDate
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
	
}
