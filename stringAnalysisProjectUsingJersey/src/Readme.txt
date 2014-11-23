This is a Web application project deployed at Google App Engine.
It is a RESTful project using JERSEY (an implementation of JAX-RS) and JAXB.
The RESTful service provides a POST method which gets a JSON with a "stringToAnalyze" 
chain and return a JSON with "firstNonRepeatedCharacter" in this chain.

The service is reachable at the following address:

http://stringanalysisapplication.appspot.com/stringAnalysisService/stringToAnalyze

To test this project, we have used SoapUI tool.
Here is some use cases:

{"stringToAnalyze" :"street"}  ->  {"firstNonRepeatedCharacter": "s"}
{"stringToAnalyze" :"teeter"}  ->  {"firstNonRepeatedCharacter": "r"}
{"stringToAnalyze" :"kelloke"} ->  {"firstNonRepeatedCharacter": "o"}
{"stringToAnalyze" :"kayyak"}  ->  {"firstNonRepeatedCharacter": "null"}
