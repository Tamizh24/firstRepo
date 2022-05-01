package serialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import serialization_pojo.ComplexPayload;
import serialization_pojo.Countries;
import serialization_pojo.Data;

public class ComplexCode {

	
	
	@Test
	public void name() throws JsonProcessingException {
		
		
		String de="Map containing Country, Capital, Currency, and some States of that Country";
		String re="Asia";
		
		String co="India";
		
		String ca="New Delhi";
		int mi=6;
		int mu=45;
		String cu="Rupee";
		
		
		
		Data daobject=new Data(ca,mi,mu,cu);
		Countries coobject=new Countries(co,daobject);
		ComplexPayload pay1=new ComplexPayload(de,re,coobject );
		
		
		
		
		ObjectMapper obj1=new ObjectMapper();
		
		String writeValueAsString = obj1.writerWithDefaultPrettyPrinter().writeValueAsString(pay1);
		System.out.println(writeValueAsString);
		
		
	}
	
}
