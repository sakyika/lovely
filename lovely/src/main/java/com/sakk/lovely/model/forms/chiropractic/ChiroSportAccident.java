package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;

/**
 * PAST SPORTS ACCIDENT
 */

@Entity
@Table(name = "CHIRO_SPORTS_ACCIDENT")
public class ChiroSportAccident extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroSportAccident.class);

	@Column(name = "SPORTSACCIDENT_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chiroExperienceId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_SPORTSACCIDENT", joinColumns = { @JoinColumn(name = "SPORTS_ACCIDENT_ID", referencedColumnName = "SPORTSACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "CHIROPATIENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "SPORTS_ACCIDENT")
	private boolean sportsAccident;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPORTS_ACCIDENT_DATE")
	private Date sportsAccidentDate;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	@Column(name = "INURY_RESOLVED")
	private boolean injuryResolved;

	@Column(name = "ACCIDENT_BRIEF_ACCOUNT")
	private String accidentBriefAccount;

	@Type(type = "yes_no")
	@Column(name = "MEDICAL_CARE_RECEIVED")
	private boolean medicalCareReceived;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careTypeGiven;

	public Integer getChiroExperienceId() {
		return chiroExperienceId;
	}

	public void setChiroExperienceId(Integer chiroExperienceId) {
		this.chiroExperienceId = chiroExperienceId;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isSportsAccident() {
		return sportsAccident;
	}

	public void setSportsAccident(boolean sportsAccident) {
		this.sportsAccident = sportsAccident;
	}

	public Date getSportsAccidentDate() {
		return sportsAccidentDate;
	}

	public void setSportsAccidentDate(Date sportsAccidentDate) {
		this.sportsAccidentDate = sportsAccidentDate;
	}

	public String getBodyPartInjured() {
		return bodyPartInjured;
	}

	public void setBodyPartInjured(String bodyPartInjured) {
		this.bodyPartInjured = bodyPartInjured;
	}

	public boolean isInjuryResolved() {
		return injuryResolved;
	}

	public void setInjuryResolved(boolean injuryResolved) {
		this.injuryResolved = injuryResolved;
	}

	public String getAccidentBriefAccount() {
		return accidentBriefAccount;
	}

	public void setAccidentBriefAccount(String accidentBriefAccount) {
		this.accidentBriefAccount = accidentBriefAccount;
	}

	public boolean isMedicalCareReceived() {
		return medicalCareReceived;
	}

	public void setMedicalCareReceived(boolean medicalCareReceived) {
		this.medicalCareReceived = medicalCareReceived;
	}

	public String getCareGivenBy() {
		return careGivenBy;
	}

	public void setCareGivenBy(String careGivenBy) {
		this.careGivenBy = careGivenBy;
	}

	public String getCareTypeGiven() {
		return careTypeGiven;
	}

	public void setCareTypeGiven(String careTypeGiven) {
		this.careTypeGiven = careTypeGiven;
	}

}
