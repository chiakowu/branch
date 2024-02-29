package com.example.branch.controller;

import com.example.branch.service.UserService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @Autowired
    private UserService userService;

    @GET
    @RequestMapping(value = "/user/{name}")
    public Response getUser(@PathVariable("name") String name) {
        System.out.println("here is UserController");
        return this.userService.getUser(name);
    }
}
