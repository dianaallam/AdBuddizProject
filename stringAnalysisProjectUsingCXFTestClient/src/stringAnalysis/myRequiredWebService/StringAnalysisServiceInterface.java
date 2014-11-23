package stringAnalysis.myRequiredWebService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import stringAnalysis.resources.*;

@Path("/stringAnalysisService/")
public interface StringAnalysisServiceInterface {
	@POST
    @Path("/stringToAnalyze")
    @Consumes("application/json")
    @Produces("application/json")
	public NonRepeatedCharacter analyzeString(ResourceToAnalyze stringToAnalyse);

}
