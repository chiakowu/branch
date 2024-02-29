package com.example.branch.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = License.LicenseBuilder.class)
public class License {
    @JsonProperty("key")
    String key;

    @JsonProperty("name")
    String name;

    @JsonProperty("spdx_id")
    String spdxId;

    @JsonProperty("url")
    String url;

    @JsonProperty("node_id")
    String nodeId;
    @JsonPOJOBuilder
    public static class LicenseBuilder {}
}
