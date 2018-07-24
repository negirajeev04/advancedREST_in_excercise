package advancedREST.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import advancedREST.model.Date;

@Path("date")
public class DateResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{dateString}")
	public String getDate(@PathParam("dateString") Date date) {
		return "Date - "+date.toString();
	}
}
