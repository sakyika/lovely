package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * PAST SPORTS ACCIDENT
 */

@Entity
@Table(name = "CHIRO_SPORTS_ACCIDENT")
public class ChiroSportAccident extends BaseEntity {

	@Id
	@Column(name = "SPORTSACCIDENT_ID", unique = true, nullable = false)
	private Integer chiroExperienceId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_SPORTSACCIDENT", joinColumns = { @JoinColumn(name = "SPORTS_ACCIDENT_ID", referencedColumnName = "SPORTSACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
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

}
