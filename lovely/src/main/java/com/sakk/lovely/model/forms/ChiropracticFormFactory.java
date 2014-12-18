package com.sakk.lovely.model.forms;

import com.sakk.lovely.model.forms.chiropractic.ChiropracticForm;

public class ChiropracticFormFactory extends FormAbstractFactory {

	@Override
	public ChiropracticForm getChiropracticForm(String chiropracticFormType) {
		if (chiropracticFormType == null) {

			return null;

		}
		if (chiropracticFormType.equalsIgnoreCase("ChiropracticNewPatient")) {
			return new ChiropracticNewPatient();
		} else if (chiropracticFormType
				.equalsIgnoreCase("ChiropracticOrthodicsExam")) {
			return new ChiropracticOrthodicsExam();
		} else if (chiropracticFormType
				.equalsIgnoreCase("ChiropracticPhysiclaExam")) {
			return new ChiropracticPhysicalExam();
		} else if (chiropracticFormType
				.equalsIgnoreCase("ChiropracticReevaluation")) {
			return new ChiropracticReevaluation();
		} else if (chiropracticFormType.equalsIgnoreCase("SoapNotes")) {
			return new ChiropracticSoapNotes();
		}

		return null;

	}

	@Override
	public MassageForm getMassageForm(String massageFormType) {
		return null;
	}

}
