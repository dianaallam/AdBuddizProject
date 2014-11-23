This is a simple Java project.

It helps to test the "stringAnalysisProjectUsingCXF" project.
To test it, you should run "stringAnalysis.myRequiredWebService.Client" class as 
a Java Application.

The client uses the Java required interface of the RESTful project:
 "StringAnalysisServiceInterface" 
 and the resource classes.
 
 The client is build from a Spring configuration.
 The spring configuration refers to the Root URL of the Web Service:
 http://localhost:8080/stringAnalysisProjectUsingCXF

The client gets a proxy which refers to the local required interface 
"StringAnalysisServiceInterface".
To call the Web service, the client has simply to call the method in the 
"StringAnalysisServiceInterface" interface and gets in return an instance of 
"NonRepeatedCharacter".
