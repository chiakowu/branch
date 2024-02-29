package com.example.branch;

import com.example.branch.client.GitHubClient;
import com.example.branch.controller.UserController;
import com.example.branch.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = GitHubClient.class)
@ComponentScan(basePackageClasses = UserService.class)
@ComponentScan(basePackageClasses = UserController.class)
public class BranchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BranchApplication.class, args);
    }
}
