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
import com.sakk.lovely.model.Pregnancy;

/**
 * MEDICAL HISTORY
 */

public class ChiroMedicalHistory extends BaseEntity {

	@Id
	@Column(name = "MEDICALHISTORY_ID", unique = true, nullable = false)
	private Integer medicalHistoryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_MEDICALHISTORY", joinColumns = { @JoinColumn(name = "MEDICAL_HISTORY_ID", referencedColumnName = "MEDICALHISTORY_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;

	@Column(name = "FAMILY_DOCTOR_NAME")
	private String familyDoctorName;

	@Column(name = "FAMILY_DOCTOR_PHONE")
	private String familyDoctorPhone;

	@Column(name = "FAMILY_DOCTOR_ADDRESS")
	private String familyDoctoryAddress;

	public Integer getMedicalHistoryId() {
		return medicalHistoryId;
	}

	public void setMedicalHistoryId(Integer medicalHistoryId) {
		this.medicalHistoryId = medicalHistoryId;
	}

	public ChiroPatientInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getFamilyDoctorName() {
		return familyDoctorName;
	}

	public void setFamilyDoctorName(String familyDoctorName) {
		this.familyDoctorName = familyDoctorName;
	}

	public String getFamilyDoctorPhone() {
		return familyDoctorPhone;
	}

	public void setFamilyDoctorPhone(String familyDoctorPhone) {
		this.familyDoctorPhone = familyDoctorPhone;
	}

	public String getFamilyDoctoryAddress() {
		return familyDoctoryAddress;
	}

	public void setFamilyDoctoryAddress(String familyDoctoryAddress) {
		this.familyDoctoryAddress = familyDoctoryAddress;
	}

	public Date getLastFullCheckUp() {
		return lastFullCheckUp;
	}

	public void setLastFullCheckUp(Date lastFullCheckUp) {
		this.lastFullCheckUp = lastFullCheckUp;
	}

	public boolean isOnMedication() {
		return onMedication;
	}

	public void setOnMedication(boolean onMedication) {
		this.onMedication = onMedication;
	}

	public String getMedicationType1() {
		return medicationType1;
	}

	public void setMedicationType1(String medicationType1) {
		this.medicationType1 = medicationType1;
	}

	public String getMedicationType1For() {
		return medicationType1For;
	}

	public void setMedicationType1For(String medicationType1For) {
		this.medicationType1For = medicationType1For;
	}

	public String getMedicationType1Dose() {
		return medicationType1Dose;
	}

	public void setMedicationType1Dose(String medicationType1Dose) {
		this.medicationType1Dose = medicationType1Dose;
	}

	public String getMedicationType1Frequency() {
		return medicationType1Frequency;
	}

	public void setMedicationType1Frequency(String medicationType1Frequency) {
		this.medicationType1Frequency = medicationType1Frequency;
	}

	public String getMedicationType2() {
		return medicationType2;
	}

	public void setMedicationType2(String medicationType2) {
		this.medicationType2 = medicationType2;
	}

	public String getMedicationType2For() {
		return medicationType2For;
	}

	public void setMedicationType2For(String medicationType2For) {
		this.medicationType2For = medicationType2For;
	}

	public String getMedicationType2Dose() {
		return medicationType2Dose;
	}

	public void setMedicationType2Dose(String medicationType2Dose) {
		this.medicationType2Dose = medicationType2Dose;
	}

	public String getMedicationType2Frequency() {
		return medicationType2Frequency;
	}

	public void setMedicationType2Frequency(String medicationType2Frequency) {
		this.medicationType2Frequency = medicationType2Frequency;
	}

	public String getSurgery1() {
		return surgery1;
	}

	public void setSurgery1(String surgery1) {
		this.surgery1 = surgery1;
	}

	public Date getSurgery1Date() {
		return surgery1Date;
	}

	public void setSurgery1Date(Date surgery1Date) {
		this.surgery1Date = surgery1Date;
	}

	public boolean isSurgery1Complications() {
		return surgery1Complications;
	}

	public void setSurgery1Complications(boolean surgery1Complications) {
		this.surgery1Complications = surgery1Complications;
	}

	public String getSurgery2() {
		return surgery2;
	}

	public void setSurgery2(String surgery2) {
		this.surgery2 = surgery2;
	}

	public Date getSurgery2Date() {
		return surgery2Date;
	}

	public void setSurgery2Date(Date surgery2Date) {
		this.surgery2Date = surgery2Date;
	}

	public boolean isSurgery2Complications() {
		return surgery2Complications;
	}

	public void setSurgery2Complications(boolean surgery2Complications) {
		this.surgery2Complications = surgery2Complications;
	}

	public boolean isVision() {
		return vision;
	}

	public void setVision(boolean vision) {
		this.vision = vision;
	}

	public boolean isHearing() {
		return hearing;
	}

	public void setHearing(boolean hearing) {
		this.hearing = hearing;
	}

	public boolean isSmell() {
		return smell;
	}

	public void setSmell(boolean smell) {
		this.smell = smell;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public boolean isDizziness() {
		return dizziness;
	}

	public void setDizziness(boolean dizziness) {
		this.dizziness = dizziness;
	}

	public boolean isHeadaches() {
		return headaches;
	}

	public void setHeadaches(boolean headaches) {
		this.headaches = headaches;
	}

	public boolean isDifficultySwallowing() {
		return difficultySwallowing;
	}

	public void setDifficultySwallowing(boolean difficultySwallowing) {
		this.difficultySwallowing = difficultySwallowing;
	}

	public boolean isLossOfBalance() {
		return lossOfBalance;
	}

	public void setLossOfBalance(boolean lossOfBalance) {
		this.lossOfBalance = lossOfBalance;
	}

	public boolean isNightSweats() {
		return nightSweats;
	}

	public void setNightSweats(boolean nightSweats) {
		this.nightSweats = nightSweats;
	}

	public boolean isDiabetes() {
		return diabetes;
	}

	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}

	public boolean isStroke() {
		return stroke;
	}

	public void setStroke(boolean stroke) {
		this.stroke = stroke;
	}

	public boolean isAneurysm() {
		return aneurysm;
	}

	public void setAneurysm(boolean aneurysm) {
		this.aneurysm = aneurysm;
	}

	public boolean isHeartContition() {
		return heartContition;
	}

	public void setHeartContition(boolean heartContition) {
		this.heartContition = heartContition;
	}

	public boolean isOsteoprosis() {
		return osteoprosis;
	}

	public void setOsteoprosis(boolean osteoprosis) {
		this.osteoprosis = osteoprosis;
	}

	public boolean isArthritis() {
		return arthritis;
	}

	public void setArthritis(boolean arthritis) {
		this.arthritis = arthritis;
	}

	public boolean isProstateDisorder() {
		return prostateDisorder;
	}

	public void setProstateDisorder(boolean prostateDisorder) {
		this.prostateDisorder = prostateDisorder;
	}

	public boolean isMenstrualProblems() {
		return menstrualProblems;
	}

	public void setMenstrualProblems(boolean menstrualProblems) {
		this.menstrualProblems = menstrualProblems;
	}

	public boolean isHepatitis() {
		return hepatitis;
	}

	public void setHepatitis(boolean hepatitis) {
		this.hepatitis = hepatitis;
	}

	public boolean isHivInfected() {
		return hivInfected;
	}

	public void setHivInfected(boolean hivInfected) {
		this.hivInfected = hivInfected;
	}

	public boolean isShortnessOfBreath() {
		return shortnessOfBreath;
	}

	public void setShortnessOfBreath(boolean shortnessOfBreath) {
		this.shortnessOfBreath = shortnessOfBreath;
	}

	public boolean isCancer() {
		return cancer;
	}

	public void setCancer(boolean cancer) {
		this.cancer = cancer;
	}

	public boolean isStd() {
		return std;
	}

	public void setStd(boolean std) {
		this.std = std;
	}

	public boolean isTuberculosis() {
		return tuberculosis;
	}

	public void setTuberculosis(boolean tuberculosis) {
		this.tuberculosis = tuberculosis;
	}

	public boolean isChestPain() {
		return chestPain;
	}

	public void setChestPain(boolean chestPain) {
		this.chestPain = chestPain;
	}

	public boolean isHighBloodPressure() {
		return highBloodPressure;
	}

	public void setHighBloodPressure(boolean highBloodPressure) {
		this.highBloodPressure = highBloodPressure;
	}

	public boolean isDigestiveProblems() {
		return digestiveProblems;
	}

	public void setDigestiveProblems(boolean digestiveProblems) {
		this.digestiveProblems = digestiveProblems;
	}

	public boolean isBowlProblems() {
		return bowlProblems;
	}

	public void setBowlProblems(boolean bowlProblems) {
		this.bowlProblems = bowlProblems;
	}

	public boolean isBladderProblems() {
		return bladderProblems;
	}

	public void setBladderProblems(boolean bladderProblems) {
		this.bladderProblems = bladderProblems;
	}

	public boolean isSignificantWeightLoss() {
		return significantWeightLoss;
	}

	public void setSignificantWeightLoss(boolean significantWeightLoss) {
		this.significantWeightLoss = significantWeightLoss;
	}

	public boolean isPinsAndNeedlesInArm() {
		return pinsAndNeedlesInArm;
	}

	public void setPinsAndNeedlesInArm(boolean pinsAndNeedlesInArm) {
		this.pinsAndNeedlesInArm = pinsAndNeedlesInArm;
	}

	public boolean isNumbnessInFingers() {
		return numbnessInFingers;
	}

	public void setNumbnessInFingers(boolean numbnessInFingers) {
		this.numbnessInFingers = numbnessInFingers;
	}

	public boolean isWeaknessInFingers() {
		return weaknessInFingers;
	}

	public void setWeaknessInFingers(boolean weaknessInFingers) {
		this.weaknessInFingers = weaknessInFingers;
	}

	public boolean isNumblessInLegs() {
		return numblessInLegs;
	}

	public void setNumblessInLegs(boolean numblessInLegs) {
		this.numblessInLegs = numblessInLegs;
	}

	public boolean isWeaknessInLegs() {
		return weaknessInLegs;
	}

	public void setWeaknessInLegs(boolean weaknessInLegs) {
		this.weaknessInLegs = weaknessInLegs;
	}

	public boolean isBackPain() {
		return backPain;
	}

	public void setBackPain(boolean backPain) {
		this.backPain = backPain;
	}

	public boolean isNeckPain() {
		return neckPain;
	}

	public void setNeckPain(boolean neckPain) {
		this.neckPain = neckPain;
	}

	public boolean isTmjDisorder() {
		return tmjDisorder;
	}

	public void setTmjDisorder(boolean tmjDisorder) {
		this.tmjDisorder = tmjDisorder;
	}

	public boolean isEarRinging() {
		return earRinging;
	}

	public void setEarRinging(boolean earRinging) {
		this.earRinging = earRinging;
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

	public Pregnancy getPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(Pregnancy pregnancy) {
		this.pregnancy = pregnancy;
	}

	public Date getLastMenstrualPeriod() {
		return lastMenstrualPeriod;
	}

	public void setLastMenstrualPeriod(Date lastMenstrualPeriod) {
		this.lastMenstrualPeriod = lastMenstrualPeriod;
	}

	public boolean isChiropractorToContactMedicalDoctor() {
		return chiropractorToContactMedicalDoctor;
	}

	public void setChiropractorToContactMedicalDoctor(
			boolean chiropractorToContactMedicalDoctor) {
		this.chiropractorToContactMedicalDoctor = chiropractorToContactMedicalDoctor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFullCheckUp;

	@Type(type = "yes_no")
	private boolean onMedication;

	@Column(name = "MEDICATION_TYPE1")
	private String medicationType1;

	@Column(name = "MEDICATION_TYPE1FOR")
	private String medicationType1For;

	@Column(name = "MEDICATION_TYPE1DOSE")
	private String medicationType1Dose;

	@Column(name = "MEDICATION_TYPE1FREQUENCY")
	private String medicationType1Frequency;

	@Column(name = "MEDICATION_TYPE2")
	private String medicationType2;

	@Column(name = "MEDICATION_TYPE2FOR")
	private String medicationType2For;

	@Column(name = "MEDICATION_TYPE2DOSE")
	private String medicationType2Dose;

	@Column(name = "MEDICATION_TYPE2FREQUENCY")
	private String medicationType2Frequency;

	@Column(name = "SURGERY1")
	private String surgery1;

	@Temporal(TemporalType.TIMESTAMP)
	private Date surgery1Date;

	@Type(type = "yes_no")
	private boolean surgery1Complications;

	@Column(name = "SURGERY2")
	private String surgery2;

	@Temporal(TemporalType.TIMESTAMP)
	private Date surgery2Date;

	@Type(type = "yes_no")
	private boolean surgery2Complications;

	@Type(type = "yes_no")
	private boolean vision;

	@Type(type = "yes_no")
	private boolean hearing;

	@Type(type = "yes_no")
	private boolean smell;

	@Type(type = "yes_no")
	private boolean taste;

	@Type(type = "yes_no")
	private boolean dizziness;

	@Type(type = "yes_no")
	private boolean headaches;

	@Type(type = "yes_no")
	private boolean difficultySwallowing;

	@Type(type = "yes_no")
	private boolean lossOfBalance;

	@Type(type = "yes_no")
	private boolean nightSweats;

	@Type(type = "yes_no")
	private boolean diabetes;

	@Type(type = "yes_no")
	private boolean stroke;

	@Type(type = "yes_no")
	private boolean aneurysm;

	@Type(type = "yes_no")
	private boolean heartContition;

	@Type(type = "yes_no")
	private boolean osteoprosis;

	@Type(type = "yes_no")
	private boolean arthritis;

	@Type(type = "yes_no")
	private boolean prostateDisorder;

	@Type(type = "yes_no")
	private boolean menstrualProblems;

	@Type(type = "yes_no")
	private boolean hepatitis;

	@Type(type = "yes_no")
	private boolean hivInfected;

	@Type(type = "yes_no")
	private boolean shortnessOfBreath;

	@Type(type = "yes_no")
	private boolean cancer;

	@Type(type = "yes_no")
	private boolean std;

	@Type(type = "yes_no")
	private boolean tuberculosis;

	@Type(type = "yes_no")
	private boolean chestPain;

	@Type(type = "yes_no")
	private boolean highBloodPressure;

	@Type(type = "yes_no")
	private boolean digestiveProblems;

	@Type(type = "yes_no")
	private boolean bowlProblems;

	@Type(type = "yes_no")
	private boolean bladderProblems;

	@Type(type = "yes_no")
	private boolean significantWeightLoss;

	@Type(type = "yes_no")
	private boolean pinsAndNeedlesInArm;

	@Type(type = "yes_no")
	private boolean numbnessInFingers;

	@Type(type = "yes_no")
	private boolean weaknessInFingers;

	@Type(type = "yes_no")
	private boolean numblessInLegs;

	@Type(type = "yes_no")
	private boolean weaknessInLegs;

	@Type(type = "yes_no")
	private boolean backPain;

	@Type(type = "yes_no")
	private boolean neckPain;

	@Type(type = "yes_no")
	private boolean tmjDisorder;

	@Type(type = "yes_no")
	private boolean earRinging;

	@Type(type = "yes_no")
	private boolean other;

	@Column(name = "OTHER_DESCRIPTION")
	private String otherDescription;

	@Enumerated(EnumType.STRING)
	private Pregnancy pregnancy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastMenstrualPeriod;

	@Type(type = "yes_no")
	private boolean chiropractorToContactMedicalDoctor;

}
