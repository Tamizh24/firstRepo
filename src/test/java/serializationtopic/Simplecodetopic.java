package serializationtopic;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import serialization_pojo_topic.Payloadtopic;
public class Simplecodetopic {
	@Test
	public void name() throws JsonProcessingException {
		String na="helloworld";
		String de="this is ur first repo";
		String ho="https://www.github.com";
		Payloadtopic pt= new Payloadtopic(na,de,ho);
		ObjectMapper obj=new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pt);
		System.out.println(writeValueAsString);
	}
}
