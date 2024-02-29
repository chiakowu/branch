package com.example.branch.model.response;

import com.example.branch.model.data.UserRepository;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
@JsonDeserialize(builder = UserResponse.UserResponseBuilder.class)
public class UserResponse {
    String userName;

    String displayName;

    String avatar;

    String geoLocation;

    String email;

    String url;

    String createdAt;

    List<UserRepository> repos;

    @JsonPOJOBuilder
    public static class UserResponseBuilder {}
}
