package com.sakk.lovely.model.forms.chiropractic;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * FAMILY HISTORY
 */

@Entity
@Table(name = "CHIRO_FAMILY_HISTORY")
public class ChiroFamilyHistory extends BaseEntity {

	@Id
	@Column(name = "FAMILYHISOTRY_ID", unique = true, nullable = false)
	private Integer familyHistoryId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_FAMILYHISTORY", joinColumns = { @JoinColumn(name = "FAMILY_HISTORY_ID", referencedColumnName = "FAMILYHISOTRY_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
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

}
