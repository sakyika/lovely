package com.sakk.lovely.model.forms.chiropractic;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;

/**
 * FAMILY HISTORY
 */

@Entity
@Table(name = "CHIRO_FAMILY_HISTORY")
public class ChiroFamilyHistory extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroFamilyHistory.class);

	@Column(name = "FAMILYHISOTRY_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer familyHistoryId;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "patientId")
	@JoinTable(name = "CHIROPATIENTINFO_FAMILYHISTORY", joinColumns = { @JoinColumn(name = "FAMILY_HISTORY_ID", referencedColumnName = "FAMILYHISOTRY_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "FAMILYHISOTRY_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "HEART_DISEASE")
	private boolean familyHeartDisease;

	@Type(type = "yes_no")
	@Column(name = "ARTHRITIS")
	private boolean familyArthritis;

	@Type(type = "yes_no")
	@Column(name = "CANCER")
	private boolean cancer;

	@Type(type = "yes_no")
	@Column(name = "DIABETES")
	private boolean diabetes;

	@Type(type = "yes_no")
	@Column(name = "PSYCHOSOCIAL_DISEASE")
	private boolean psychoSocialDisease;

	@Type(type = "yes_no")
	@Column(name = "OTHER")
	private boolean other;

	@Type(type = "yes_no")
	@Column(name = "OTHER_DESCRIPTION")
	private boolean otherDescription;

	public Integer getFamilyHistoryId() {
		return familyHistoryId;
	}

	public void setFamilyHistoryId(Integer familyHistoryId) {
		this.familyHistoryId = familyHistoryId;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isFamilyHeartDisease() {
		return familyHeartDisease;
	}

	public void setFamilyHeartDisease(boolean familyHeartDisease) {
		this.familyHeartDisease = familyHeartDisease;
	}

	public boolean isFamilyArthritis() {
		return familyArthritis;
	}

	public void setFamilyArthritis(boolean familyArthritis) {
		this.familyArthritis = familyArthritis;
	}

	public boolean isCancer() {
		return cancer;
	}

	public void setCancer(boolean cancer) {
		this.cancer = cancer;
	}

	public boolean isDiabetes() {
		return diabetes;
	}

	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}

	public boolean isPsychoSocialDisease() {
		return psychoSocialDisease;
	}

	public void setPsychoSocialDisease(boolean psychoSocialDisease) {
		this.psychoSocialDisease = psychoSocialDisease;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public boolean isOtherDescription() {
		return otherDescription;
	}

	public void setOtherDescription(boolean otherDescription) {
		this.otherDescription = otherDescription;
	}

}
