package com.sakk.lovely.model.forms.chiropractic.dao;

import java.util.List;

import com.sakk.lovely.exception.ChiroDuplicatePatientException;
import com.sakk.lovely.exception.ChiroPatientNotFoundException;
import com.sakk.lovely.model.forms.chiropractic.ChiroPatient;

public interface ChiroPatientDAO {

	public void addPatient(ChiroPatient chiroPatient)
			throws ChiroDuplicatePatientException;

	public ChiroPatient getPatient(int patientId)
			throws ChiroPatientNotFoundException;

	public ChiroPatient getPatient(String patientId)
			throws ChiroPatientNotFoundException;

	public void updatePatientInfo(ChiroPatient chiroPatient)
			throws ChiroPatientNotFoundException,
			ChiroDuplicatePatientException;

	public void deletePatient(Integer patientId)
			throws ChiroPatientNotFoundException;

	public List<ChiroPatient> getPatients();
	
	

}
