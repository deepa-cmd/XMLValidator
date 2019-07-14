package com.noesis;
import java.util.List;

import javax.xml.bind.JAXBElement;

import com.jaxb.InternationalType;
import com.jaxb.NameType;
import com.jaxb.Results;
import com.jaxb.Results.Var;

/**
 * Methods in this class can be overridden to print the complete nested elements
 *
 */

public class ResultsPrinter {

	public void printResults(Results result) {
		if (result != null) {
			List<Object> results = result.getVarOrError();
			results.forEach((item) -> {
				System.out.println("Result: ");
				if (item.getClass() == Var.class) {
					Var var = (Var) item;
					printVars(var);

				} else {
					InternationalType errors = (InternationalType) item;
					printErrors(errors);

				}
			});
		}

	}

	@SuppressWarnings("unchecked")
	protected void printVars(Var var) {
		System.out.print("Var: ");
		NameType names = var.getName();
		printName(names);

		JAXBElement<String> mandatory = (JAXBElement<String>) var.getMandatory();
		System.out.println(
				" mandatory field:" + mandatory.getName().getLocalPart() + " value:" + mandatory.getValue());

		JAXBElement<String> optional = (JAXBElement<String>) var.getOptional();
		if (optional != null)
			System.out.print(
					" optinal field:" + optional.getName().getLocalPart() + " value:" + optional.getValue());

		//System.out.println(var.getX());
		System.out.println();
	}

	protected void printName(NameType names) {
		names.getContent().forEach((name) -> {
			if (name.getClass() == String.class)
				System.out.print("Name:" + name.toString());

		});
	}

	@SuppressWarnings("unchecked")
	protected void printErrors(InternationalType errors) {
		System.out.print("Error: ");
		errors.getContent().forEach((error) -> {
			if (error != null && error.getClass() == JAXBElement.class) {
				JAXBElement<String> e = (JAXBElement<String>) error;
				if (e != null) {
					System.out.print(" "+ e.getName().getLocalPart() + ":" + e.getValue()+" ");
				}
			}
		});
		System.out.println();
	}

}
