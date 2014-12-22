package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * PAST WORK ACCIDENTS
 */

public class ChiroWorkAccident extends BaseEntity {

	@Id
	@Column(name = "WORKACCIDENT_ID", unique = true, nullable = false)
	private Integer workAccidentId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_WORKACCIDENT", joinColumns = { @JoinColumn(name = "WORK_ACCIDENT_ID", referencedColumnName = "WORKACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
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

}
