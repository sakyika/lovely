package com.sakk.lovely.chiropractic.forms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakk.lovely.chiropractic.exception.ChiroDuplicatePatientException;
import com.sakk.lovely.chiropractic.exception.ChiroPatientNotFoundException;
import com.sakk.lovely.chiropractic.forms.dao.ChiroPatientDAO;
import com.sakk.lovely.chiropractic.forms.model.ChiroPatient;

@Service
@Transactional
public class ChiroPatientServiceImpl implements ChiroPatientService {

	@Autowired
	private ChiroPatientDAO patientDAO;

	@Override
	public void addPatient(ChiroPatient chiroPatient)
			throws ChiroDuplicatePatientException {
		patientDAO.addPatient(chiroPatient);

	}

	@Override
	public ChiroPatient getPatient(int patientId)
			throws ChiroPatientNotFoundException {
		return patientDAO.getPatient(patientId);
	}

	@Override
	public ChiroPatient getPatient(String patientId)
			throws ChiroPatientNotFoundException {
		return patientDAO.getPatient(patientId);
	}

	@Override
	public void updatePatientInfo(ChiroPatient chiroPatient)
			throws ChiroPatientNotFoundException,
			ChiroDuplicatePatientException {
		patientDAO.updatePatientInfo(chiroPatient);
	}

	@Override
	public void deletePatient(Integer patientId)
			throws ChiroPatientNotFoundException {
		patientDAO.deletePatient(patientId);
	}

	@Override
	public List<ChiroPatient> getPatients() {
		return patientDAO.getPatients();
	}

}
