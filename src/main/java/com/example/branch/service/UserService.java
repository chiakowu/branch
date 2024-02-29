package com.example.branch.service;

import com.example.branch.client.GitHubClient;
import com.example.branch.model.data.GitHubRepository;
import com.example.branch.model.data.User;
import com.example.branch.model.data.UserRepository;
import com.example.branch.model.response.UserResponse;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    private final GitHubClient gitHubClient;

    public UserService() {
        this.gitHubClient = new GitHubClient();
    }

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
                .url(user.getUrl())
                .createdAt(user.getCreatedAt())
                .repos(userRepositoryList)
                .build();

        return Response.ok().entity(userResponse).build();
    }
}
