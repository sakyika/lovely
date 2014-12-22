package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.PainPattern;
import com.sakk.lovely.model.PainScale;
import com.sakk.lovely.model.TimeOfDay;

/**
 * CURRENT CONDITION/PRESENT COMPLAINT
 */

public class ChiroComplaint extends BaseEntity {

	@Id
	@Column(name = "COMPLAINT_ID", unique = true, nullable = false)
	private Integer complaintId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_COMPLAINT", joinColumns = { @JoinColumn(name = "COMPLAINT_ID", referencedColumnName = "COMPLAINT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
	@Type(type = "yes_no")
	@Column(name = "SHARP")
	private boolean sharp;

	@Type(type = "yes_no")
	@Column(name = "DULL")
	private boolean dull;

	@Type(type = "yes_no")
	@Column(name = "THROBBING")
	private boolean throbbing;

	@Type(type = "yes_no")
	@Column(name = "ACHING")
	private boolean aching;

	@Type(type = "yes_no")
	@Column(name = "BURNING")
	private boolean burning;

	@Type(type = "yes_no")
	@Column(name = "STABBING")
	private boolean stabbing;

	@Type(type = "yes_no")
	@Column(name = "WEAKNESS")
	private boolean weakness;

	@Type(type = "yes_no")
	@Column(name = "NUMBNESS")
	private boolean numbness;

	@Type(type = "yes_no")
	@Column(name = "TINGLING")
	private boolean tingling;

	@Type(type = "yes_no")
	@Column(name = "OTHER")
	private boolean other;

	@Column(name = "OTHER_DESCRIPTION")
	private String otherDescription;

	@Column(name = "LOCATION")
	private String location;

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	private Date startDate;

	@Type(type = "yes_no")
	@Column(name = "PREVIOUS_OCCURANCE")
	private boolean previousOccurance;

	@Temporal(TemporalType.DATE)
	@Column(name = "PREVIOUS_OCCURANCE_DATE")
	private Date previousOccuranceDate;

	@Column(name = "HOW_IT_HAPPENED")
	private String howItHappened;

	@Column(name = "WHAT_MAKES_WORST")
	private String whatMakesWorst;

	@Column(name = "WHAT_MAKES_BETTER")
	private String whatMakesBetter;

	@Type(type = "yes_no")
	@Column(name = "PAIN_RADIATES")
	private boolean painRadiates;

	@Column(name = "PAIN_RADIATES_WHERE")
	private String painRadiatesWhere;

	@Enumerated(EnumType.STRING)
	@Column(name = "PAIN_PATTERN")
	private PainPattern painPattern;

	@Enumerated(EnumType.STRING)
	@Column(name = "PAIN_SCALE")
	private PainScale painScale;

	@Enumerated(EnumType.STRING)
	@Column(name = "PAIN_WORST")
	private TimeOfDay painWorst;

}
