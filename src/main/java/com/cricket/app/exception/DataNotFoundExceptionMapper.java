package com.cricket.app.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cricket.app.beans.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException e) {
		ErrorMessage error = new ErrorMessage(e.getMessage(), 204, "https://en.wikipedia.org/wiki/HTTP_404");
		return Response.status(Status.NO_CONTENT).
				entity(error).
				type(MediaType.APPLICATION_JSON).
				build();
	}
	
}
