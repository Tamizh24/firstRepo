package serialization_pojo;

import java.util.List;

public class Countries {

	
	private String Country;
	private Data Data;
	
	
	public Countries(String co,  Data da) {
		this.Country=co;
		this.Data=da;
		
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public Data getData() {
		return Data;
	}


	public void setData(Data data) {
		Data = data;
	}


	
	
	
	
	
	
	
	
	
}
