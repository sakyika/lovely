package com.sakk.lovely.model.forms;

public class MassageFormFactory extends FormAbstractFactory {

	@Override
	public ChiropracticForm getChiropracticForm(String chiropracticFormType) {

		return null;

	}

	@Override
	public MassageForm getMassageForm(String massageForm) {

		if (massageForm == null) {
			return null;
		}
		if (massageForm.equalsIgnoreCase("MassageNewPatient")) {
			return new MassageNewPatient();
		} else if (massageForm.equalsIgnoreCase("MassagePhysicalExam")) {
			return new MassagePhysicalExam();
		} else if (massageForm.equalsIgnoreCase("MassageSoapNotes")) {
			return new MassageSoapNotes();
		}

		return null;
	}

}
