package com.example.branch.configuration;

import com.example.branch.controller.UserController;
import com.example.branch.service.UserService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(UserController.class);
        register(UserService.class);
    }
}
