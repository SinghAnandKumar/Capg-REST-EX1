package com.barclays;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
    @GET
    @Path("person")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Person getPersonDetails(){
    	Person p = new Person();
    	p.setAge(20);
    	p.setName("Anand Kumar Singh");
    	return p;
    }
    
    @POST
    @Path("person")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Person setPerson(HashMap<String, String> person){
    	System.out.println(person);
    	
    	/*List<String> age = person.get("age");	
    	List<String> name = person.get("name");*/
    	
    	Person p = new Person();
    	p.setAge(Integer.parseInt(person.get("age")));
    	p.setName(person.get("name"));
    	return p;
    	
    }
   /* public Response setPerson(MultivaluedMap<String, String> person){
    	System.out.println(person);
    	
    	return Response.status(200).build();
    }*/
}
