package com.sakk.lovely.chiropractic.forms.type;

public class FormFactoryProducer {
	public static FormAbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("ChiropracticForm")) {
			return new ChiropracticFormFactory();
		} else if (choice.equalsIgnoreCase("MassageForm")) {
			return new MassageFormFactory();
		}
		return null;
	}

}
