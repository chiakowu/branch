package com.example.branch.client;

import com.example.branch.model.data.GitHubRepository;
import com.example.branch.model.data.User;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GitHubClient {
    private static final String GITHUB_BASE_URL = "https://api.github.com/users/";
    private static final String REPOS = "repos";

    private final WebTarget githubWebTarget;

    public GitHubClient() {
        Client client = ClientBuilder.newClient();
        this.githubWebTarget = client.target(GITHUB_BASE_URL);
    }

    public User getUser(String name) {
        Response response = this.githubWebTarget.path(name).request(MediaType.APPLICATION_JSON).get();
        if (response.getStatus() == 200) {
            return response.readEntity(User.class);
        } else {
            throw new RuntimeException();
        }
    }

    public List<GitHubRepository> getUserRepos(String name) {
        Response response = this.githubWebTarget.path(name).path(REPOS).request(MediaType.APPLICATION_JSON).get();
        if (response.getStatus() == 200) {
            return response.readEntity(new GenericType<>() {});
        } else {
            throw new RuntimeException();
        }
    }
}
