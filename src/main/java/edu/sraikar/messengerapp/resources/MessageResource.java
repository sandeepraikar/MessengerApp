package edu.sraikar.messengerapp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.sraikar.messengerapp.model.Message;
import edu.sraikar.messengerapp.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService service = new MessageService();
	
	/* v_0.1
	@GET      // This is to specify the relevant HTTP method!!
	@Produces(MediaType.TEXT_PLAIN) //This specifies response Format (TEXT_PLAIN indicates that the response is plain text)
	public String getMessages(){
		return "HelloWorld";
	}*/
	
	@GET      // This is to specify the relevant HTTP method!!
	@Produces(MediaType.APPLICATION_JSON) //Sending the response as XML
	public List<Message> getMessages(){
		return service.getAllMessages();
	}
	
	/*@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("messageId") String messageId){
		return "Got Path param :"+messageId;
	}*/
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id){
		return service.getMessage(id);
	}
	
	//Creating a POST request
	/*
	 * Use @Consumes to specify the expected request body format
	   basically Content-header type should have the correct format set for POST request
		
		example:
		Header_type     header_value
		Content-Type    application/json
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON) //This indicates that this post request consumes content of json format
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) //Here jersey is gonna automatically convert the json object passed to Message instance
	{
		return service.addMessage(message);
	}
}
