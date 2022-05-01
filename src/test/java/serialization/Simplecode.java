package serialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import serialization_pojo.Payload;

public class Simplecode {

	@Test
	public void name() throws JsonProcessingException {
		
		String na ="helloworld";
		String de="this is ur first repo";
		String ho= "https://www.github.com";
		
		
		Payload p=new Payload(na, de, ho);
		ObjectMapper obj =new ObjectMapper();
		
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(p);
		System.out.println(writeValueAsString);
		
	}
	
	
	
	
	
	
	
	
}
