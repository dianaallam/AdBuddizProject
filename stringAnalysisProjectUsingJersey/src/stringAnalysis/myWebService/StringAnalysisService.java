package stringAnalysis.myWebService;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import stringAnalysis.resources.*;
@Path("/stringAnalysisService/")
public class StringAnalysisService  {
	@POST
    @Path("/stringToAnalyze")
    @Consumes("application/json")
    @Produces("application/json")
	public NonRepeatedCharacter analyzeString(
			ResourceToAnalyze stringToAnalyse) {
		// TODO Auto-generated method stub
		Character firstNonRepeatedCharacter = stringToAnalyse.getFirstNonRepeatedCharacter();
		if(firstNonRepeatedCharacter == null)
			return new NonRepeatedCharacter("null");
		else
			return new NonRepeatedCharacter(firstNonRepeatedCharacter.toString());
	}
}

