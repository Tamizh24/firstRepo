package serialization_pojo;

public class Data {

	private String Capital;
	private int minimumtemp;
	private int maximumtemp;
	private String Currency;
	
	
	public Data(String ca, int mi,int ma,String cu) {
		this.Capital=ca;
		this.minimumtemp=mi;
		this.maximumtemp=ma;
		this.Currency=cu;
		
	}

	
	

	public String getCapital() {
		return Capital;
	}


	public void setCapital(String capital) {
		Capital = capital;
	}


	public int getMinimumtemp() {
		return minimumtemp;
	}


	public void setMinimumtemp(int minimumtemp) {
		this.minimumtemp = minimumtemp;
	}


	public int getMaximumtemp() {
		return maximumtemp;
	}


	public void setMaximumtemp(int maximumtemp) {
		this.maximumtemp = maximumtemp;
	}


	public String getCurrency() {
		return Currency;
	}


	public void setCurrency(String currency) {
		Currency = currency;
	}
	
	
	
	
	
	
	
	

	
}
