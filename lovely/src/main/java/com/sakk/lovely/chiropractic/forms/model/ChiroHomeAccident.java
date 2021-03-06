package com.sakk.lovely.chiropractic.forms.model;

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

import com.sakk.lovely.core.model.BaseEntity;

/**
 * PAST HOME/SPORTS ACCIDENT
 */

@Entity
@Table(name = "CHIRO_HOME_ACCIDENT")
public class ChiroHomeAccident extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroHomeAccident.class);

	@Column(name = "HOMEACCIDENT_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer homeAccidentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_HOMEACCIDENT", joinColumns = { @JoinColumn(name = "HOME_ACCIDENT_ID", referencedColumnName = "HOMEACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "CHIROPATIENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	private boolean homeSportsAccident;

	@Temporal(TemporalType.TIMESTAMP)
	private Date homeSportsAccidentDate;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	private boolean injuryResolved;

	@Column(name = "ACCIDENT_BRIEF_ACCOUNT")
	private String accidentBriefAccount;

	@Type(type = "yes_no")
	private boolean medicalCareReceived;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careTypeGiven;

	public boolean isHomeSportsAccident() {
		return homeSportsAccident;
	}

	public void setHomeSportsAccident(boolean homeSportsAccident) {
		this.homeSportsAccident = homeSportsAccident;
	}

	public Date getHomeSportsAccidentDate() {
		return homeSportsAccidentDate;
	}

	public void setHomeSportsAccidentDate(Date homeSportsAccidentDate) {
		this.homeSportsAccidentDate = homeSportsAccidentDate;
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
