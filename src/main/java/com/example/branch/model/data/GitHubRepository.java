package com.example.branch.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = GitHubRepository.GitHubRepositoryBuilder.class)
public class GitHubRepository {
    @JsonProperty("id")
    int id;

    @JsonProperty("node_id")
    String nodeId;

    @JsonProperty("name")
    String name;

    @JsonProperty("full_name")
    String fullName;

    @JsonProperty("private")
    boolean isPrivate;

    @JsonProperty("owner")
    User owner;

    @JsonProperty("html_url")
    String htmlUrl;

    @JsonProperty("description")
    String description;

    @JsonProperty("fork")
    boolean isFork;

    @JsonProperty("url")
    String url;

    @JsonProperty("forks_url")
    String forksUrl;

    @JsonProperty("keys_url")
    String keysUrl;

    @JsonProperty("collaborators_url")
    String collaboratorsUrl;

    @JsonProperty("teams_url")
    String teamsUrl;

    @JsonProperty("hooks_url")
    String hooksUrl;

    @JsonProperty("issue_events_url")
    String issueEventsUrl;

    @JsonProperty("events_url")
    String eventsUrl;

    @JsonProperty("assignees_url")
    String assigneesUrl;

    @JsonProperty("branches_url")
    String branchesUrl;

    @JsonProperty("tags_url")
    String tagsUrl;

    @JsonProperty("blobs_url")
    String blobsUrl;

    @JsonProperty("git_tags_url")
    String gitTagsUrl;

    @JsonProperty("git_refs_url")
    String gitRefsUrl;

    @JsonProperty("trees_url")
    String treesUrl;

    @JsonProperty("statuses_url")
    String statusesUrl;

    @JsonProperty("languages_url")
    String languagesUrl;

    @JsonProperty("stargazers_url")
    String stargazersUrl;

    @JsonProperty("contributors_url")
    String contributorsUrl;

    @JsonProperty("subscribers_url")
    String subscribersUrl;

    @JsonProperty("subscription_url")
    String subscriptionUrl;

    @JsonProperty("commits_url")
    String commitsUrl;

    @JsonProperty("git_commits_url")
    String gitCommitsUrl;

    @JsonProperty("comments_url")
    String commentsUrl;

    @JsonProperty("issue_comment_url")
    String issueCommentUrl;

    @JsonProperty("contents_url")
    String contentsUrl;

    @JsonProperty("compare_url")
    String compareUrl;

    @JsonProperty("merges_url")
    String mergesUrl;

    @JsonProperty("archive_url")
    String archiveUrl;

    @JsonProperty("downloads_url")
    String downloadsUrl;

    @JsonProperty("issues_url")
    String issuesUrl;

    @JsonProperty("pulls_url")
    String pullsUrl;

    @JsonProperty("milestones_url")
    String milestonesUrl;

    @JsonProperty("notifications_url")
    String notificationsUrl;

    @JsonProperty("labels_url")
    String labelsUrl;

    @JsonProperty("releases_url")
    String releasesUrl;

    @JsonProperty("deployments_url")
    String deploymentsUrl;

    @JsonProperty("created_at")
    String createdAt;

    @JsonProperty("updated_at")
    String updatedAt;

    @JsonProperty("pushed_at")
    String pushedAt;

    @JsonProperty("git_url")
    String gitUrl;

    @JsonProperty("ssh_url")
    String sshUrl;

    @JsonProperty("clone_url")
    String cloneUrl;

    @JsonProperty("svn_url")
    String svnUrl;

    @JsonProperty("homepage")
    String homepage;

    @JsonProperty("size")
    int size;

    @JsonProperty("stargazers_count")
    int stargazersCount;

    @JsonProperty("watchers_count")
    int watchersCount;

    @JsonProperty("language")
    String language;

    @JsonProperty("has_issues")
    boolean hasIssues;

    @JsonProperty("has_projects")
    boolean hasProjects;

    @JsonProperty("has_downloads")
    boolean hasDownloads;

    @JsonProperty("has_wiki")
    boolean hasWiki;

    @JsonProperty("has_pages")
    boolean hasPages;

    @JsonProperty("has_discussions")
    boolean hasDiscussions;

    @JsonProperty("forks_count")
    int forksCount;

    @JsonProperty("mirror_url")
    String mirrorUrl;

    @JsonProperty("archived")
    boolean archived;

    @JsonProperty("disabled")
    boolean disabled;

    @JsonProperty("open_issues_count")
    int openIssuesCount;

    @JsonProperty("license")
    Object license;

    @JsonProperty("allow_forking")
    boolean allowForking;

    @JsonProperty("is_template")
    boolean isTemplate;

    @JsonProperty("web_commit_signoff_required")
    boolean webCommitSignoffRequired;

    @JsonProperty("topics")
    String[] topics;

    @JsonProperty("visibility")
    String visibility;

    @JsonProperty("forks")
    int forks;

    @JsonProperty("open_issues")
    int openIssues;

    @JsonProperty("watchers")
    int watchers;

    @JsonProperty("default_branch")
    String defaultBranch;

    @JsonPOJOBuilder
    public static class GitHubRepositoryBuilder {}
}
