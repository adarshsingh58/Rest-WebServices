package onilne.mrwallet.www.REST_With_Produce_Consume;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import online.mrwallet.www.Beans.Student;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource") // This made this class as a rest resource class which can
					// be accessed at 'myresource' path
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 * 
	 * This method will handle post req with secified produce and consume. GET
	 * req do not have BODY so they do not use CONTENT-TYPE header which means
	 * using @Consume for a get request is irrelevant
	 * 
	 * 
	 * we go to POSTMAN chrome plugin and send a POST request to
	 * http://localhost:8080/REST_With_Produce_Consume/webapi/myresource with
	 * plain text body and content-type as text and accept as application/xml.
	 * 
	 */
	@POST // says his method will handle a post request
	@Produces(MediaType.APPLICATION_XML) // that has either no ACCEPT header or have a ACCEPT header set to application/xml
	@Consumes(MediaType.TEXT_PLAIN) // and whose CONTENT-TYPE is text/plain 
	public Student getIt() { // Return type is a Class with @XMLRootElement at
							// top as @Produces is application/xml so we must
							// return an XML convertible class object
		
		Student student=new Student("adarsh","12we");
		return student;
	}
}
