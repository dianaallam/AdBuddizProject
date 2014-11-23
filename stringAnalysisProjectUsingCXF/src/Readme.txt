This is a Dynamic Web Project.
It is a RESTful project using CXF (an implementation of JAX-RS) and JAXB.
The RESTful service provides a POST method which gets a JSON with a "stringToAnalyze" 
chain and return a JSON with "firstNonRepeatedCharacter" in this chain.

The service is deployed locally using Appache Tomcat v8.0.

This project uses a Spring configuration (see WebContent/WEB-INF/bean.xml file) to 
configure the JAXB context for marshalling/unmarshalling. 
Using this Spring configuration, the classes in "stringAnalysis.resources" package 
does not contain any JAXB annotation. That makes the Java code more elegant and allows
the use of these classes in another context than for this Web Service.

To test this project, please refer to the "stringAnalysisProjectUsingCXFTestClient".

