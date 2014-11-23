package stringAnalysis.resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class ResourceToAnalyze {
	
	private String stringToAnalyze;
	
	public ResourceToAnalyze(){
		this("default");
	}
	
	public ResourceToAnalyze(String stringToAnalyze){
		this.stringToAnalyze = stringToAnalyze;
	}
	
	public Character getFirstNonRepeatedCharacter(){
		
		boolean continueAnalyze = true;
		/*
		 * The treatedCharacters set is used to save previously treated characters in 
		 * the string
		 */
		
		Set<Character> treatedCharacters = new HashSet<Character>();
		
		// charValueAti is a variable to save the current treated character
		char charValueAti;
		
		/* charValueAtj is a variable used to stock the character resulted
		after each iteration in the following loop */
		char charValueAtj;
		
		/* external loop to iterate on all characters */
		
		for(int i = 0;  i < this.getStringToAnalyze().length(); i++){
			continueAnalyze=true;
			charValueAti = this.getStringToAnalyze().charAt(i);
			
			/* verifying if charValueAti character is already treated */
			Character c;
			Iterator<Character> iterator =  treatedCharacters.iterator();
			while(continueAnalyze &&  iterator.hasNext()){
				c = iterator.next();
				/* 
				 * if charValueAti is already treated, stop the analysis for it and 
				 * go to the next character
				 */
				if(c == charValueAti) continueAnalyze = false;
			}
			
			/*
			 * if charValueAti isn't an already treated character, verify if it is the last
			 * character in the string
			 */
			if(i == this.getStringToAnalyze().length()-1 && continueAnalyze == true) 
				
				/*
				 * if charValueAti is the last character, return it as the first non repeated 
				 * character
				 */
				return charValueAti;
			
				/*
				 * internal loop to iterate on all characters after charValueAti 
				 */
				else {
					for(int j =i+1; continueAnalyze && j < this.getStringToAnalyze().length(); j++){
						charValueAtj=this.getStringToAnalyze().charAt(j);
						/*
						 * if the character in iteration is equal to charValueAti,
						 * stock this character in the list of treatedCharacter and stop 
						 * the analysis
						 */
						if(charValueAti == charValueAtj){
							continueAnalyze = false;
							treatedCharacters.add(charValueAtj);
						}
						/*
						 * if the character in iteration is not equal to charValueAti and
						 * it is the last character in the string, return 
						 * charValueAti as the first non repeated character 
						 */
						else if(j == this.getStringToAnalyze().length()-1){
							return charValueAti;
						}
					}
				}
		}
		
		/*
		 * if all characters are repeated, return null
		 */
		return null;
	}

	public String getStringToAnalyze() {
		return stringToAnalyze;
	}

	public void setStringToAnalyze(String stringToAnalyze) {
		this.stringToAnalyze = stringToAnalyze;
	}
	
	

}
