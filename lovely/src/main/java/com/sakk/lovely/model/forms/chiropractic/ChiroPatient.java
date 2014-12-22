package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.Title;

/**
 * 
 * General Information
 *
 */

@Entity
@Table(name = "CHIRO_PATIENT")
public class ChiroPatient extends BaseEntity {

	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroPatient.class);

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public List<ChiroExperience> getChiroExperienceList() {
		return chiroExperienceList;
	}

	public void setChiroExperienceList(List<ChiroExperience> chiroExperienceList) {
		this.chiroExperienceList = chiroExperienceList;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHearAboutUs() {
		return hearAboutUs;
	}

	public void setHearAboutUs(String hearAboutUs) {
		this.hearAboutUs = hearAboutUs;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	@Id
	@Column(name = "PATIENT_ID", unique = true, nullable = false)
	private Integer patientId;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENT_CHIROEXPERIENCES", joinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_EXPERIENCE_ID", referencedColumnName = "CHIROEXPERIENCE_ID") })
	private List<ChiroExperience> chiroExperienceList;
	
	

	@Enumerated(EnumType.STRING)
	@Column(name = "TITLE")
	private Title title;

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "HOME_PHONE", length = 50)
	private String homePhone;

	@Column(name = "WORK_PHONE", length = 50)
	private String workPhone;

	@Column(name = "CELL_PHONE", length = 50)
	private String cellPhone;

	@Column(name = "OCCUPATION", length = 50)
	private String occupation;

	@Column(name = "EMPLOYER", length = 50)
	private String employer;

	@Column(name = "EMAIL", length = 50)
	private String email;

	@Column(name = "HEAR_ABOUT_US", length = 50)
	private String hearAboutUs;

	@Column(name = "EMERGENCY_CONTACT", length = 50)
	private String emergencyContact;

	@Column(name = "EMERGENCY_CONTACT_PHONE", length = 50)
	private String emergencyContactPhone;

}
