package serialization_pojo;

public class Payload {
	String name;
	String description;
	String homepage;
	


	public Payload(String na,String de,String ho ) {
		
		this.name=na;
		this.description=de;
		this.homepage=ho;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	
	
}
