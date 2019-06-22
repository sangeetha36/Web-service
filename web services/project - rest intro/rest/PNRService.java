package com.lti.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.lti.rest.PNR.Status;

@Path("/pnr")
public class PNRService {
 	
	// the url will look like this: http://localhost:8181/rest-into/rest/pnr/status?pnrNo=232443
		@GET
		@Path("/status")
		public PNR getStatus(@QueryParam("pnrNo") int pnrNo , 
				@Context HttpServletResponse response) {
			
			//setting CORS header
			response.setHeader("Access-Control-Allow-Origin","http://localhost:4200");
			//code to executing the required method of aDAO  
			//or any other class will be here missing right now
			PNR pnr = new PNR();
			pnr.setPnrNo(pnrNo);
			pnr.setTrainNo(111);
			pnr.setDate("25-june-2019");
			pnr.setStatus(Status.RAC);
			
			return pnr;
		}
	}
	

