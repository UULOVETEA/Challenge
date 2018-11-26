package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

@Path("/func")
public class RestTest {	
	Function func = new Function();
	@GET
	@Path("/stringClean")
	@Produces(MediaType.TEXT_HTML)
	public String test1 (@QueryParam ("string") String str) {	
		String resource = "The string you entered: " + str + 
				". After remove duplicate value: " + Function.stringClean(str);
		return resource;
	}
	
	@GET
	@Path("/maxBlock")
	@Produces(MediaType.TEXT_HTML)
	public String test2 (@QueryParam ("string") String str) {
		int num = Function.maxBlock(str);
		String resource = "The string you entered: " + str + 
				". The length of largest block is: " + String.valueOf(num);
		return resource;
	}
		
	@GET
	@Path("/reorderBlock")
	@Produces(MediaType.TEXT_HTML)
	public String test3 (@QueryParam ("string") String str) {
		String resource = "The string you entered: " + str + 
				". The new string is: " + Function.reorderBlock(str);
		return resource;
	}
}
