package onilne.mrwallet.www.restclass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MyRestClass {

	@GET
	public String getName_GET()
	{
		return "adarsh";
	}
}
