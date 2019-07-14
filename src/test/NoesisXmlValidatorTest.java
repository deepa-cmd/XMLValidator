package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.xml.sax.SAXException;
import com.noesis.*;

public class NoesisXmlValidatorTest {
	UCIResultsValidator validator;
	private final static String XSDFILEPATH = "src/main/resources/UCIExtractResultsConfig.xsd";

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@org.junit.Test
	public void validateXsd() {
		try {
			validator = new UCIResultsValidator(XSDFILEPATH);
		} catch (SAXException e) {
			fail("No exception expected!");
		}
	}
	
	@org.junit.Test
	public void ValidateEmpty() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/EmptyResults.xml"));
		
	}
	
	@org.junit.Test
	public void ValidateOneEmptyError() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/OneEmptyErrorElement.xml"));
		
	}
	
	@org.junit.Test
	public void ValidateOneEmptyVar() {
		validateXsd();
		assertEquals(false, validator.validateXml("src/main/resources/OneEmptyVarElement.xml"));		
	}
	
	@org.junit.Test
	public void oneVarElement() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/OneVarElement.xml"));
		
	}
	
	@org.junit.Test
	public void oneErrorElement() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/OneErrorElement.xml"));
		
	}
	
	@org.junit.Test
	public void VarAndErrorElement() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/VarAndError.xml"));
		
	}
	@org.junit.Test
	public void NestedNameElemnt() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/NestedNameElement.xml"));
		
	}
	
	@org.junit.Test
	public void MultipleVars() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/MultipleVarElements.xml"));
		
	}
	
	@org.junit.Test
	public void MultipleErrors() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/MultipleErrorElements.xml"));
		
	}
	
	@org.junit.Test
	public void MultipleVarsAndErrors() {
		validateXsd();
		assertEquals(true, validator.validateXml("src/main/resources/MultipleVarsAndErrors.xml"));
		
	}
	
	@org.junit.Test
	public void Varwithmandatory() {
		validateXsd();
		assertEquals(false, validator.validateXml("src/main/resources/VarwithmandatoryString.xml"));
		
	}
	
	@org.junit.Test
	public void MultipleNameInVar() {
		validateXsd();
		assertEquals(false, validator.validateXml("src/main/resources/MultipleNameInVar.xml"));
		
	}

}
