package stringAnalysis.myWebService;


import stringAnalysis.resources.*;

public class StringAnalysisService implements StringAnalysisServiceInterface {

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

