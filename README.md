AdBuddizProject
===============

String Analysis project


In this repository, we present two implementation projects:

1) a project using Jersey ("stringAnalysisProjectUsingJersey") which is deployed on Google App Engine and available at the following URL:
http://stringanalysisapplication.appspot.com/stringAnalysisService/stringToAnalyze


2) a project using CXF ("stringAnalysisProjectUsingCXF" and its client "stringAnalysisProjectUsingCXFTestClient") 
which can be tested locally on an Apache Tomcat v8.0


The CXF project has an advantage face to the Jersey project concerning the developped Code. For some compatibility reasons between CXF and GAE, 
this project requires some more adaptations to be deployed at GAE.

The advantages of the CXF project are:

1) the Web service defines an interface which contains all the JAX-RS annotations. 
The implementation class for this service is a Java class without any annotation. 
The Advantages: We can provide different implementations of the Web service interface without the need for repeating the JAX-RS annotations on each implementation 
class. Moreover, this interface could be used at a client implemented in Java to call the Web Service using the practices of Java
development. The client makes a request by simplly calling an "analyzeString" method using an instance of "ResourceToAnalyze" 
and gets in return an instance of "NonRepeatedCharacter".

2) the resource classes ("ResourceToAnalyze" and "NonRepeatedCharacter") used as input and output data for the Web service do not contain any JAXB annotation.
 That makes the Java code more elegant and allows the use of these classes in another context than for this Web Service.

For more details about each project, please refer to the Readme.txt file in the src folder in each project.


