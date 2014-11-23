package stringAnalysis.resources;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class NonRepeatedCharacter {
	
	private String firstNonRepeatedCharacter;
	
	public NonRepeatedCharacter(){
		this("d");
	}
	public NonRepeatedCharacter(String firstNonRepeatedCharacter){
		this.firstNonRepeatedCharacter = firstNonRepeatedCharacter;
	}

	public String getFirstNonRepeatedCharacter() {
		return firstNonRepeatedCharacter;
	}

	public void setFirstNonRepeatedCharacter(String firstNonRepeatedCharacter) {
		this.firstNonRepeatedCharacter = firstNonRepeatedCharacter;
	}
	

    
	
	

}
