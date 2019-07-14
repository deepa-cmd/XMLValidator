package com.noesis;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.SAXException;
import com.jaxb.Results;

/**
 *  Main class takes the XML file path as argument. An exception is thrown if no path is provided.
 *  it validates the given XML using the xml schema with SAX APIs
 *  if the xml is valid, it is unmarshalled using JAXB APIs
 *  A printer object is created to print the content of the elements
 *
 */
public class Main {

	private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
	private final static String XSDFILEPATH = "src/main/resources/UCIExtractResultsConfig.xsd";
	private  static ResultsPrinter printer;  
	private static UCIResultsValidator xmlValidator;
	private static UCIResultsExtracter extractor;

	/**
	 * Main method
	 * @param args takes the path of the xml file to be validated and converted as an command line argument.
	 * @throws IllegalArgumentException if the number of command line arguments is not equal to 1.
	 */
	public static void main(String[] args) throws IllegalArgumentException {

		if (args.length != 1) {
			System.out.println("Number of arguments must be 1");

			LOGGER.log(Level.SEVERE, "Number of arguments must be 2");
			throw new IllegalArgumentException("Arguments mismatched");
		}	
		
		printer = new ResultsPrinter();
		String xmlFilePath = String.valueOf(args[0]);

		xmlValidator = null;
		try {
			xmlValidator = new UCIResultsValidator(XSDFILEPATH);
		} catch (SAXException ex) {

			LOGGER.log(Level.SEVERE, "Failed to get the Schema");
			LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
		}

		if (xmlValidator != null && xmlValidator.validateXml(xmlFilePath)) {
			System.out.println("The document was validated OK");

			extractor = new UCIResultsExtracter();
			Results resultObj = extractor.UCIExtractResults(xmlFilePath);
			
			printer.printResults(resultObj);
		} else
			System.out.println("The document failed to validate");

	}

	 

}
