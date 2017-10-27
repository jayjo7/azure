/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbux.azure.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jmounagu
 */
@Path("/hello")
public class PublicApi {


    public void PublicApi(){
        System.out.println(this.getClass().getName() + " is initizated");
    }

    @GET
    @Path("/{param}")
    public Response getIntroMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;
	return Response.ok(output, MediaType.APPLICATION_JSON).build();

    }
}
