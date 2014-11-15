package com.sakk.lovely.model.forms;

public abstract class FormAbstractFactory {

	public abstract ChiropracticForm getChiropracticForm(String chiropracticForm);

	public abstract MassageForm getMassageForm(String massageForm);

}
