package stringAnalysis.myRequiredWebService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import stringAnalysis.resources.*;





public class Client {

	public static void main(String args[]) throws Exception {
		
		
		ClassPathXmlApplicationContext context 
        = new ClassPathXmlApplicationContext(new String[] {"stringAnalysis\\myRequiredWebService\\beans.xml"});

        StringAnalysisServiceInterface proxy = (StringAnalysisServiceInterface)context.getBean("client");
        
        
        
        System.out.println("\n");
        NonRepeatedCharacter firstNonRepeatedCharacter = proxy.analyzeString(new ResourceToAnalyze("stress"));
        System.out.println("The first non repeated character in stress is :" + firstNonRepeatedCharacter.getFirstNonRepeatedCharacter());
        
        firstNonRepeatedCharacter = proxy.analyzeString(new ResourceToAnalyze("teeter"));
        System.out.println("The first non repeated character in teeter is :" + firstNonRepeatedCharacter.getFirstNonRepeatedCharacter());
        
        firstNonRepeatedCharacter = proxy.analyzeString(new ResourceToAnalyze("kelloke"));
        System.out.println("The first non repeated character in kelloke is :" + firstNonRepeatedCharacter.getFirstNonRepeatedCharacter());
        
        firstNonRepeatedCharacter = proxy.analyzeString(new ResourceToAnalyze("kayyak"));
        System.out.println("The first non repeated character in kayyak is :" + firstNonRepeatedCharacter.getFirstNonRepeatedCharacter());
      
	}

}
