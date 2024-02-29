package com.example.branch.service;

import com.example.branch.client.GitHubClient;
import com.example.branch.model.data.GitHubRepository;
import com.example.branch.model.data.User;
import com.example.branch.model.data.UserRepository;
import com.example.branch.model.response.UserResponse;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.example.branch.util.Utils.dateFormatter;

/**
 * Service - fetches the data from GitHub API and process the data to the user
 */
@Component
public class UserService {
    @Autowired
    private GitHubClient gitHubClient;

    public UserService() { }

    public Response getUser(String name) {
        User user = gitHubClient.getUser(name);

        List<GitHubRepository> gitHubRepositories = gitHubClient.getUserRepos(name);

        List<UserRepository> userRepositoryList = gitHubRepositories.stream()
                .map(repo -> UserRepository.builder()
                        .name(repo.getName())
                        .url(repo.getHtmlUrl())
                        .build())
                .toList();

        UserResponse userResponse = UserResponse.builder()
                .userName(user.getLogin())
                .displayName(user.getName())
                .avatar(user.getAvatarUrl())
                .geoLocation(user.getLocation())
                .email(user.getEmail())
                .url(user.getHtmlUrl())
                .createdAt(dateFormatter(user.getCreatedAt()))
                .repos(userRepositoryList)
                .build();

        return Response.ok().entity(userResponse).build();
    }
}
