package com.test;

import net.webservicex.LengthUnit;
import net.webservicex.LengthUnitSoap;
import net.webservicex.Lengths;

public class UnitConverter_Main {
	public static void main(String args[]) {
		LengthUnit service = new LengthUnit();
		LengthUnitSoap stub = service.getLengthUnitSoap();
		double lengthValue=20;
		Lengths fromLengthUnit = Lengths.INCHES;
		Lengths toLengthUnit = Lengths.CENTIMETERS;
		double convertedValue = stub.changeLengthUnit(lengthValue, fromLengthUnit, toLengthUnit);
		System.out.println("The Converted values is : " + convertedValue);
	}
}
