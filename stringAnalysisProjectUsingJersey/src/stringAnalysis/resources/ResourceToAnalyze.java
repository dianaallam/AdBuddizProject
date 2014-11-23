package stringAnalysis.resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
		Set<Character> treatedCharacters = new HashSet<Character>();
		char charValueAti;
		char charValueAtj;
		for(int i =0;  i < this.getStringToAnalyze().length(); i++){
			continueAnalyze=true;
			charValueAti = this.getStringToAnalyze().charAt(i);
			
			Character c;
			Iterator<Character> iterator =  treatedCharacters.iterator();
			while(continueAnalyze &&  iterator.hasNext()){
				c = iterator.next();
				if(c == charValueAti) continueAnalyze = false;
			}
			
			if(i == this.getStringToAnalyze().length()-1 && continueAnalyze == true) 
				return charValueAti;
			
				else {
					for(int j =i+1; continueAnalyze && j < this.getStringToAnalyze().length(); j++){
						charValueAtj=this.getStringToAnalyze().charAt(j);
						if(charValueAti == charValueAtj){
							continueAnalyze = false;
							treatedCharacters.add(charValueAtj);
						}
						
						else if(j == this.getStringToAnalyze().length()-1){
							return charValueAti;
						}
					}
				}

	
		}
		
		return null;
	}

	public String getStringToAnalyze() {
		return stringToAnalyze;
	}

	public void setStringToAnalyze(String stringToAnalyze) {
		this.stringToAnalyze = stringToAnalyze;
	}
	
	

}
