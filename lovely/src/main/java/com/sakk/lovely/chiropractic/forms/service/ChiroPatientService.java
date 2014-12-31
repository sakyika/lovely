package com.sakk.lovely.chiropractic.forms.service;

import java.util.List;

import com.sakk.lovely.chiropractic.exception.ChiroDuplicatePatientException;
import com.sakk.lovely.chiropractic.exception.ChiroPatientNotFoundException;
import com.sakk.lovely.chiropractic.forms.model.ChiroPatient;

public interface ChiroPatientService {
	
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
