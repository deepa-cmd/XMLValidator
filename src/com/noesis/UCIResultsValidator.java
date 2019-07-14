package com.noesis;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p> Java class for validating an xml file against a given xml schema  description.
 *
 */
public class UCIResultsValidator {
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
	String schemaLang = XMLConstants.W3C_XML_SCHEMA_NS_URI;
	Validator validator;

	/**
	 * Class Constructor
	 * 
	 * @param xsdFilePath path of the xml schema file against which to validate a
	 *                    xml later.
	 * @throws SAXException
	 */
	public UCIResultsValidator(String xsdFilePath) throws SAXException {
		File xsdFile = new File(xsdFilePath);
		SchemaFactory factory = SchemaFactory.newInstance(schemaLang);
		Schema schema = factory.newSchema(xsdFile);
		validator = schema.newValidator();

	}

	/**
	 * validates a given Xml file against this validator.
	 * 
	 * @param xmlFilePath path of the xml file to be validates
	 * @return <true> when the xml file is valid otherwise false
	 */
	public boolean validateXml(String xmlFilePath) {
		try {
			Path xmlPath = Paths.get(xmlFilePath);
			Reader reader = Files.newBufferedReader(xmlPath);
			SAXSource source = new SAXSource(new InputSource(reader));
			validator.validate(source);
			return true;

		} catch (SAXException ex) {
			LOGGER.log(Level.SEVERE, "The document failed to validate");
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
			return false;
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
			return false;
		}

	}
}
