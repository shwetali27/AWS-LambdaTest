package com.bridgelabz.control;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.bridgelabz.model.Request;
import com.bridgelabz.model.Response;

public class LambdaHandler implements RequestHandler<Request, Response>{

	public Response handleRequest(Request pRequest, Context pContext) {
		String message = "Hello, "+ pRequest.getmFirstName() +" "+pRequest.getmLastName(); 
		return new Response(message);
	}

}
