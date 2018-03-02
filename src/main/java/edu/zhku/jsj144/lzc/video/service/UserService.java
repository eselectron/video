package edu.zhku.jsj144.lzc.video.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import edu.zhku.jsj144.lzc.video.pojo.User;

@Path("user")
public interface UserService {

	@GET
	public User getUser(@QueryParam("username") String username);
	
	@GET
	@Path("/{id}")
	public User getUserById(@PathParam("id") String id);
}