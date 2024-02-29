package com.example.branch.controller;

import com.example.branch.service.UserService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller - the endpoint the service exposes
 */
@RestController
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * getUser endpoint - path: <baseUrl>/user/{name} i.e. http://localhost8080/user/{name}
     * @param name username
     * @return Jersey Response - with status and the data
     */
    @GET
    @RequestMapping(value = "/user/{name}")
    public Response getUser(@PathVariable("name") String name) {
        // regex is happily sponsored by ChatGPT :))
        String regex = "^[a-zA-Z\\d](?:[a-zA-Z\\d]|-(?=[a-zA-Z\\d])){0,38}$";
        if (!name.matches(regex)) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return this.userService.getUser(name);
    }
}
