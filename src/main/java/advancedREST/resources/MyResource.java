package advancedREST.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("myresource/{path}")
public class MyResource {

	@PathParam("path") private String pathParam;
	@QueryParam("query") private String queryParam;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "Hello, World "+" Path Param = "+pathParam+"; Query Param = "+queryParam;
	}
	
}
