package com.sakk.lovely.chiropractic.forms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sakk.lovely.chiropractic.exception.ChiroDuplicatePatientException;
import com.sakk.lovely.chiropractic.exception.ChiroPatientNotFoundException;
import com.sakk.lovely.chiropractic.forms.dao.ChiroPatientDAO;
import com.sakk.lovely.chiropractic.forms.model.ChiroPatient;

@Repository
public class ChiroPatientDAOImpl implements ChiroPatientDAO {

	static Logger logger = LoggerFactory.getLogger(ChiroPatientDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addPatient(ChiroPatient chiroPatient)
			throws ChiroDuplicatePatientException {
		logger.debug("ChiroPatientDAOImpl.addUser() - ["
				+ chiroPatient.getFirstName() + " "
				+ chiroPatient.getLastName() + "]");
		try {
			ChiroPatient patientCheck = getPatient(chiroPatient.getId());
			String message = "The patient [" + patientCheck.getFirstName()
					+ " " + patientCheck.getLastName() + "] already exists";
			throw new ChiroDuplicatePatientException(message);
		} catch (ChiroPatientNotFoundException e) {

			getCurrentSession().save(chiroPatient);

		}

	}

	@Override
	public ChiroPatient getPatient(int patientId)
			throws ChiroPatientNotFoundException {
		logger.debug("UserDAOImpl.getUser() - [" + patientId + "]");
		ChiroPatient patientObject = (ChiroPatient) getCurrentSession().get(
				ChiroPatient.class, patientId);

		if (patientObject == null) {
			throw new ChiroPatientNotFoundException("Patient id [" + patientId
					+ "] not found");
		} else {
			return patientObject;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public ChiroPatient getPatient(String patientId)
			throws ChiroPatientNotFoundException {

		logger.debug("ChiroPatientDAOImpl.getPatient() = [" + patientId + "]");
		Query query = getCurrentSession().createQuery(
				"from where patientId = :patientId");

		query.setString("patientId", patientId);

		logger.debug(query.toString());

		if (query.list().size() == 0) {
			throw new ChiroPatientNotFoundException("Patient ["
					+ patientId.toString() + "] not found");
		} else {
			logger.debug("User List Size: " + query.list() + "] not found");
			List<ChiroPatient> list = (List<ChiroPatient>) query.list();

			ChiroPatient patientObject = (ChiroPatient) list.get(0);

			return patientObject;
		}
	}

	@Override
	public void updatePatientInfo(ChiroPatient chiroPatient)
			throws ChiroPatientNotFoundException,
			ChiroDuplicatePatientException {
		ChiroPatient patient = getPatient(chiroPatient.getId());

		if (patient.getId() == chiroPatient.getId()) {
			patient.setAddress(chiroPatient.getAddress());
			patient.setHomePhone(chiroPatient.getHomePhone());
			patient.setWorkPhone(chiroPatient.getWorkPhone());
			patient.setCellPhone(chiroPatient.getCellPhone());
			patient.setOccupation(chiroPatient.getOccupation());
			patient.setEmployer(chiroPatient.getEmployer());
			patient.setEmail(chiroPatient.getEmail());
			patient.setEmergencyContact(chiroPatient.getEmergencyContact());
			patient.setEmergencyContactPhone(chiroPatient
					.getEmergencyContactPhone());

			getCurrentSession().update(patient);
		} else {
			String message = "The patient [" + patient.getFirstName() + " "
					+ patient.getLastName() + "] already exists";

			throw new ChiroDuplicatePatientException(message);
		}

	}

	@Override
	public void deletePatient(Integer patientId)
			throws ChiroPatientNotFoundException {
		ChiroPatient patient = getPatient(patientId);
		if (patient != null) {
			getCurrentSession().delete(patient);
		}

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ChiroPatient> getPatients() {

		return getCurrentSession().createQuery("from ChiroPatient").list();
	}

}
