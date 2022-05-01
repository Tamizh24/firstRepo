package Batch2.Batch2;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonParsing {

	
	@Test
	public void name() {
		
		
		JsonPath js=new JsonPath(Payload.employeegreens());
		
//1)		
		int edsize = js.getInt("employeeDetails.size()");
		System.out.println(edsize);
		
//2)
		
		int ts = js.getInt("dashBoard.totalSalary");
		System.out.println(ts);
		
//3)
		Object edname = js.get("employeeDetails.name[0]");
		
		System.out.println(edname);
		
//4)
		
		int jhonexp = js.getInt("employeeDetails.exp[2]");
		System.out.println(jhonexp);
	}
}
