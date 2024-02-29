package com.example.branch.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = Owner.OwnerBuilder.class)
public class Owner {
    @JsonProperty("login")
    String login;

    @JsonProperty("id")
    int id;

    @JsonProperty("node_id")
    String nodeId;

    @JsonProperty("avatar_url")
    String avatarUrl;

    @JsonProperty("gravatar_id")
    String gravatarId;

    @JsonProperty("url")
    String url;

    @JsonProperty("html_url")
    String htmlUrl;

    @JsonProperty("followers_url")
    String followersUrl;

    @JsonProperty("following_url")
    String followingUrl;

    @JsonProperty("gists_url")
    String gistsUrl;

    @JsonProperty("starred_url")
    String starredUrl;

    @JsonProperty("subscriptions_url")
    String subscriptionsUrl;

    @JsonProperty("organizations_url")
    String organizationsUrl;

    @JsonProperty("repos_url")
    String reposUrl;

    @JsonProperty("events_url")
    String eventsUrl;

    @JsonProperty("received_events_url")
    String receivedEventsUrl;

    @JsonProperty("type")
    String type;

    @JsonProperty("site_admin")
    boolean siteAdmin;

    @JsonPOJOBuilder
    public static class OwnerBuilder {}
}
