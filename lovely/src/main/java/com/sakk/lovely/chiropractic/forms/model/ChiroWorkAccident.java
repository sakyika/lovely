package com.sakk.lovely.chiropractic.forms.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.core.model.BaseEntity;

/**
 * PAST WORK ACCIDENTS
 */

@Entity
@Table(name = "CHIRO_WORK_ACCIDENT")
public class ChiroWorkAccident extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroWorkAccident.class);

	@Column(name = "WORKACCIDENT_ID", unique = true, nullable = false)
	private Integer workAccidentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_WORKACCIDENT", joinColumns = { @JoinColumn(name = "WORK_ACCIDENT_ID", referencedColumnName = "WORKACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "CHIROPATIENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "WORK_ACCIDENT")
	private boolean workAccident;

	@Type(type = "yes_no")
	@Column(name = "WORK_ACCIDENT_DATE")
	private Date date;

	@Type(type = "yes_no")
	@Column(name = "EMPLOYER")
	private String employer;

	@Type(type = "yes_no")
	@Column(name = "WSIB_CLAIM")
	private boolean WSIBClaim;

	@Column(name = "DISABILITY")
	private String permanentOrPartialDisability;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	@Column(name = "X-RAY_TAKEN")
	private boolean xrayTaken;

	@Column(name = "BRIEF_ACCOUNT_OF_ACCIDENT")
	private String briefAccountOfAccident;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careGivenType;

	@Column(name = "INJURIES_SUSTAINED")
	private String injurySustained;

	@Type(type = "yes_no")
	@Column(name = "INJURY_RESOLVED")
	private boolean injuryResolved;

	public Integer getWorkAccidentId() {
		return workAccidentId;
	}

	public void setWorkAccidentId(Integer workAccidentId) {
		this.workAccidentId = workAccidentId;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isWorkAccident() {
		return workAccident;
	}

	public void setWorkAccident(boolean workAccident) {
		this.workAccident = workAccident;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public boolean isWSIBClaim() {
		return WSIBClaim;
	}

	public void setWSIBClaim(boolean wSIBClaim) {
		WSIBClaim = wSIBClaim;
	}

	public String getPermanentOrPartialDisability() {
		return permanentOrPartialDisability;
	}

	public void setPermanentOrPartialDisability(
			String permanentOrPartialDisability) {
		this.permanentOrPartialDisability = permanentOrPartialDisability;
	}

	public String getBodyPartInjured() {
		return bodyPartInjured;
	}

	public void setBodyPartInjured(String bodyPartInjured) {
		this.bodyPartInjured = bodyPartInjured;
	}

	public boolean isXrayTaken() {
		return xrayTaken;
	}

	public void setXrayTaken(boolean xrayTaken) {
		this.xrayTaken = xrayTaken;
	}

	public String getBriefAccountOfAccident() {
		return briefAccountOfAccident;
	}

	public void setBriefAccountOfAccident(String briefAccountOfAccident) {
		this.briefAccountOfAccident = briefAccountOfAccident;
	}

	public String getCareGivenBy() {
		return careGivenBy;
	}

	public void setCareGivenBy(String careGivenBy) {
		this.careGivenBy = careGivenBy;
	}

	public String getCareGivenType() {
		return careGivenType;
	}

	public void setCareGivenType(String careGivenType) {
		this.careGivenType = careGivenType;
	}

	public String getInjurySustained() {
		return injurySustained;
	}

	public void setInjurySustained(String injurySustained) {
		this.injurySustained = injurySustained;
	}

	public boolean isInjuryResolved() {
		return injuryResolved;
	}

	public void setInjuryResolved(boolean injuryResolved) {
		this.injuryResolved = injuryResolved;
	}

}
