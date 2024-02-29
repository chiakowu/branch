package com.example.branch.model.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = UserRepository.UserRepositoryBuilder.class)
public class UserRepository {
    String name;

    String url;

    @JsonPOJOBuilder
    public static class UserRepositoryBuilder {}
}
