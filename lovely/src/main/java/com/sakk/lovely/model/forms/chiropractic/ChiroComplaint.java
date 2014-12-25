package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

	@ManyToOne(cascade = CascadeType.ALL)
	// @JoinTable(name = "CHIROPATIENTINFO_COMPLAINT", joinColumns = {
	// @JoinColumn(name = "COMPLAINT_ID", referencedColumnName = "COMPLAINT_ID")
	// }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID",
	// referencedColumnName = "COMPLAINT_ID") })
	private ChiroPatient patientInfo;

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
	@Column(name = "COMPLAINT_DATE")
	private Date complaintDate;

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

	public Integer getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isSharp() {
		return sharp;
	}

	public void setSharp(boolean sharp) {
		this.sharp = sharp;
	}

	public boolean isDull() {
		return dull;
	}

	public void setDull(boolean dull) {
		this.dull = dull;
	}

	public boolean isThrobbing() {
		return throbbing;
	}

	public void setThrobbing(boolean throbbing) {
		this.throbbing = throbbing;
	}

	public boolean isAching() {
		return aching;
	}

	public void setAching(boolean aching) {
		this.aching = aching;
	}

	public boolean isBurning() {
		return burning;
	}

	public void setBurning(boolean burning) {
		this.burning = burning;
	}

	public boolean isStabbing() {
		return stabbing;
	}

	public void setStabbing(boolean stabbing) {
		this.stabbing = stabbing;
	}

	public boolean isWeakness() {
		return weakness;
	}

	public void setWeakness(boolean weakness) {
		this.weakness = weakness;
	}

	public boolean isNumbness() {
		return numbness;
	}

	public void setNumbness(boolean numbness) {
		this.numbness = numbness;
	}

	public boolean isTingling() {
		return tingling;
	}

	public void setTingling(boolean tingling) {
		this.tingling = tingling;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public String getOtherDescription() {
		return otherDescription;
	}

	public void setOtherDescription(String otherDescription) {
		this.otherDescription = otherDescription;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isPreviousOccurance() {
		return previousOccurance;
	}

	public void setPreviousOccurance(boolean previousOccurance) {
		this.previousOccurance = previousOccurance;
	}

	public Date getPreviousOccuranceDate() {
		return previousOccuranceDate;
	}

	public void setPreviousOccuranceDate(Date previousOccuranceDate) {
		this.previousOccuranceDate = previousOccuranceDate;
	}

	public String getHowItHappened() {
		return howItHappened;
	}

	public void setHowItHappened(String howItHappened) {
		this.howItHappened = howItHappened;
	}

	public String getWhatMakesWorst() {
		return whatMakesWorst;
	}

	public void setWhatMakesWorst(String whatMakesWorst) {
		this.whatMakesWorst = whatMakesWorst;
	}

	public String getWhatMakesBetter() {
		return whatMakesBetter;
	}

	public void setWhatMakesBetter(String whatMakesBetter) {
		this.whatMakesBetter = whatMakesBetter;
	}

	public boolean isPainRadiates() {
		return painRadiates;
	}

	public void setPainRadiates(boolean painRadiates) {
		this.painRadiates = painRadiates;
	}

	public String getPainRadiatesWhere() {
		return painRadiatesWhere;
	}

	public void setPainRadiatesWhere(String painRadiatesWhere) {
		this.painRadiatesWhere = painRadiatesWhere;
	}

	public PainPattern getPainPattern() {
		return painPattern;
	}

	public void setPainPattern(PainPattern painPattern) {
		this.painPattern = painPattern;
	}

	public PainScale getPainScale() {
		return painScale;
	}

	public void setPainScale(PainScale painScale) {
		this.painScale = painScale;
	}

	public TimeOfDay getPainWorst() {
		return painWorst;
	}

	public void setPainWorst(TimeOfDay painWorst) {
		this.painWorst = painWorst;
	}

}
