XmlValidatorAndConvertor 
========================

Description
-----------
This Read, validate and convert XML files from an XML Schema Definition (XSD).
Uses SAX apis to validate the XML against the schema and JAXB APIs to convert it into objects.
The classes for the xsd files were created using JAXB API (XJC). [JAXB-v2](https://github.com/javaee/jaxb-v2)

Building
---------

Build as an Java application.

The build requires JDK 1.8.0 or later, Junit version 4 and JAXB.

Running
-------
Expects path of the XML file ad an argument.
You can get the executable jar from the release section or create it with source with MainClass as com.noesis.Main.

Running as an executable jar from the command line
--------------------------------------------------
create a folder src/main/resources with UCIExtractResultsConfig.xsd at the root directory from where to run the JAR file. 
Provide the path of the XML file as an argument.
Run the command `Java -jar ExecutableJAR FilePath` from the directory of the Jar file.

