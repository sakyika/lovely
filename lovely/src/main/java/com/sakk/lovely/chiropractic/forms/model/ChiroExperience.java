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
 * PREVIOUS CHIROPRACTIC EXPERIENCE
 */


@Entity
@Table(name = "CHIRO_EXPERIENCES")
public class ChiroExperience extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroExperience.class);

	@Column(name = "CHIROEXPERIENCE_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chiroExperienceId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_CHIROEXPERIENCES", joinColumns = { @JoinColumn(name = "CHIRO_EXPERIENCE_ID", referencedColumnName = "CHIROEXPERIENCE_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "CHIROPATIENT_ID") })
	private ChiroPatient patientInfo;

	@Column(name = "Previous_Chiropractor_Name", length = 50)
	private String previousChiropractorName;

	@Column(name = "Previous_Chiropractor_Phone")
	private String previousChiropractorPhone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChiropractorVisit;

	@Type(type = "yes_no")
	private boolean xRay;

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

	public String getPreviousChiropractorName() {
		return previousChiropractorName;
	}

	public void setPreviousChiropractorName(String previousChiropractorName) {
		this.previousChiropractorName = previousChiropractorName;
	}

	public String getPreviousChiropractorPhone() {
		return previousChiropractorPhone;
	}

	public void setPreviousChiropractorPhone(String previousChiropractorPhone) {
		this.previousChiropractorPhone = previousChiropractorPhone;
	}

	public Date getLastChiropractorVisit() {
		return lastChiropractorVisit;
	}

	public void setLastChiropractorVisit(Date lastChiropractorVisit) {
		this.lastChiropractorVisit = lastChiropractorVisit;
	}

	public boolean isxRay() {
		return xRay;
	}

	public void setxRay(boolean xRay) {
		this.xRay = xRay;
	}

}
