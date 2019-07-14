package com.noesis;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.jaxb.Results;

public class UCIResultsExtracter {

	/**
	 * converts the content of the xml file to objects
	 */
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
	
	public UCIResultsExtracter() {		
	}

	/**
	 * API to convert the content of the xml into Results objects
	 * @param xmlFilePath path of the file to be converted 
	 * @return an object of the class Results 
	 */
	public Results UCIExtractResults(String xmlFilePath) {
		try {
			JAXBContext context = JAXBContext.newInstance("com.jaxb");
			Unmarshaller unmarshaller = context.createUnmarshaller();			
			Path xmlPath = Paths.get(xmlFilePath);			
			Reader reader = Files.newBufferedReader(xmlPath);
			Results results = (Results) unmarshaller.unmarshal(reader);
			return results;
		} catch (JAXBException ex) {
			LOGGER.log(Level.SEVERE, "Failed to get the context");
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
		} catch (FileNotFoundException ex) {
			LOGGER.log(Level.SEVERE, "File not found");
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, "File not found");
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
		}
		return null;
	}

}
