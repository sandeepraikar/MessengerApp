package edu.sraikar.messengerapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
	@Produces(MediaType.APPLICATION_XML) //Sending the response as XML
	public List<Message> getMessages(){
		return service.getAllMessages();
	}
}
