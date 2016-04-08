package edu.sraikar.messengerapp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	//Note @MatrixParam uses ';' insead of '?'
	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(@MatrixParam ("param") String matrixParam,
											@HeaderParam("sampleHeader") String header,
											@CookieParam("cname") String cookie){
											
		return "Matrix param: "+ matrixParam+" customHeader:  "+header + " Cookie: "+cookie ;
	}
	

}