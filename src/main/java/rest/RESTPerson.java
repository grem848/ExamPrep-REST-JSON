package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facade.Facade;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("person")
public class RESTPerson
{

    @Context
    private UriInfo context;

    Gson gson;
    Facade f = new Facade(Persistence.createEntityManagerFactory("pu"));

    public RESTPerson()
    {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    @Path("{getamount}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonsJson(@PathParam("getamount") int amount)
    {
        String json = gson.toJson(f.getAllPersons(amount));

        return Response.ok(json).build();
    }

}
