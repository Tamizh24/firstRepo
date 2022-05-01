package serialization_pojo;

import java.util.List;

public class ComplexPayload {

	private String Description;
	private String Region;
	private Countries Countries;
	
	
	public ComplexPayload(String de, String re,Countries co) {
		this.Description=de;
		this.Region=re;
		this.Countries=co;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getRegion() {
		return Region;
	}


	public void setRegion(String region) {
		Region = region;
	}


	public Countries getCountries() {
		return Countries;
	}


	public void setCountries(Countries countries) {
		Countries = countries;
	}

	
	
	

	
	
	
}
