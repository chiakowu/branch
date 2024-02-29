package com.example.branch.service;

import com.example.branch.client.GitHubClient;

import com.example.branch.model.data.GitHubRepository;
import com.example.branch.model.data.User;
import com.example.branch.model.data.UserRepository;
import com.example.branch.model.response.UserResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private GitHubClient gitHubClient;

    @InjectMocks
    private UserService userService;

    @Test
    public void test_get_user_endpoint() {
        when(gitHubClient.getUser(any())).thenReturn(getMockUser());
        when(gitHubClient.getUserRepos(any())).thenReturn(getGitHubRepository());

        Response response = userService.getUser("octocat");

        assertThat(response.getStatus()).isEqualTo(200);
        assertThat(response.getEntity()).isEqualTo(getExpectedUserResponse());
    }

    private User getMockUser() {
        return User.builder()
                .login("octocat")
                .id(583231)
                .nodeId("MDQ6VXNlcjU4MzIzMQ==")
                .avatarUrl("https://avatars.githubusercontent.com/u/583231?v=4")
                .gravatarId("")
                .url("https://api.github.com/users/octocat")
                .htmlUrl("https://github.com/octocat")
                .followersUrl("https://api.github.com/users/octocat/followers")
                .followingUrl("https://api.github.com/users/octocat/following{/other_user}")
                .gistsUrl("https://api.github.com/users/octocat/gists{/gist_id}")
                .starredUrl("https://api.github.com/users/octocat/starred{/owner}{/repo}")
                .subscriptionsUrl("https://api.github.com/users/octocat/subscriptions")
                .organizationsUrl("https://api.github.com/users/octocat/orgs")
                .reposUrl("https://api.github.com/users/octocat/repos")
                .eventsUrl("https://api.github.com/users/octocat/events{/privacy}")
                .receivedEventsUrl("https://api.github.com/users/octocat/received_events")
                .type("User")
                .siteAdmin(false)
                .name("The Octocat")
                .company("@github")
                .blog("https://github.blog")
                .location("San Francisco")
                .email(null)
                .hireable(null)
                .bio(null)
                .twitterUsername(null)
                .publicRepos(8)
                .publicGists(8)
                .followers(12451)
                .following(9)
                .createdAt("2011-01-25T18:44:36Z")
                .updatedAt("2024-02-22T12:23:33Z")
                .build();
    }

    public List<GitHubRepository> getGitHubRepository() {
        return new ArrayList<>(Collections.singletonList(GitHubRepository.builder()
                .id(132935648)
                .nodeId("MDEwOlJlcG9zaXRvcnkxMzI5MzU2NDg=")
                .name("boysenberry-repo-1")
                .fullName("octocat/boysenberry-repo-1")
                .isPrivate(false)
                .owner(User.builder()
                        .login("octocat")
                        .id(583231)
                        .nodeId("MDQ6VXNlcjU4MzIzMQ==")
                        .avatarUrl("https://avatars.githubusercontent.com/u/583231?v=4")
                        .gravatarId("")
                        .url("https://api.github.com/users/octocat")
                        .htmlUrl("https://github.com/octocat")
                        .followersUrl("https://api.github.com/users/octocat/followers")
                        .followingUrl("https://api.github.com/users/octocat/following{/other_user}")
                        .gistsUrl("https://api.github.com/users/octocat/gists{/gist_id}")
                        .starredUrl("https://api.github.com/users/octocat/starred{/owner}{/repo}")
                        .subscriptionsUrl("https://api.github.com/users/octocat/subscriptions")
                        .organizationsUrl("https://api.github.com/users/octocat/orgs")
                        .reposUrl("https://api.github.com/users/octocat/repos")
                        .eventsUrl("https://api.github.com/users/octocat/events{/privacy}")
                        .receivedEventsUrl("https://api.github.com/users/octocat/received_events")
                        .type("User")
                        .siteAdmin(false)
                        .build())
                .htmlUrl("https://github.com/octocat/boysenberry-repo-1")
                .description("Testing")
                .isFork(true)
                .url("https://api.github.com/repos/octocat/boysenberry-repo-1")
                .forksUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/forks")
                .keysUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/keys{/key_id}")
                .collaboratorsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/collaborators{/collaborator}")
                .teamsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/teams")
                .hooksUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/hooks")
                .issueEventsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/issues/events{/number}")
                .eventsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/events")
                .assigneesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/assignees{/user}")
                .branchesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/branches{/branch}")
                .tagsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/tags")
                .blobsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/git/blobs{/sha}")
                .gitTagsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/git/tags{/sha}")
                .gitRefsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/git/refs{/sha}")
                .treesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/git/trees{/sha}")
                .statusesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/statuses/{sha}")
                .languagesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/languages")
                .stargazersUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/stargazers")
                .contributorsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/contributors")
                .subscribersUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/subscribers")
                .subscriptionUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/subscription")
                .commitsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/commits{/sha}")
                .gitCommitsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/git/commits{/sha}")
                .commentsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/comments{/number}")
                .issueCommentUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/issues/comments{/number}")
                .contentsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/contents/{+path}")
                .compareUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/compare/{base}...{head}")
                .mergesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/merges")
                .archiveUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/{archive_format}{/ref}")
                .downloadsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/downloads")
                .issuesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/issues{/number}")
                .pullsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/pulls{/number}")
                .milestonesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/milestones{/number}")
                .notificationsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/notifications{?since,all,participating}")
                .labelsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/labels{/name}")
                .releasesUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/releases{/id}")
                .deploymentsUrl("https://api.github.com/repos/octocat/boysenberry-repo-1/deployments")
                .createdAt("2018-05-10T17:51:29Z")
                .updatedAt("2024-02-28T00:32:47Z")
                .pushedAt("2022-08-01T15:42:02Z")
                .gitUrl("git://github.com/octocat/boysenberry-repo-1.git")
                .sshUrl("git@github.com:octocat/boysenberry-repo-1.git")
                .cloneUrl("https://github.com/octocat/boysenberry-repo-1.git")
                .svnUrl("https://github.com/octocat/boysenberry-repo-1")
                .homepage("")
                .size(4)
                .stargazersCount(203)
                .watchersCount(203)
                .language(null)
                .hasIssues(false)
                .hasProjects(true)
                .hasDownloads(true)
                .hasWiki(true)
                .hasPages(false)
                .hasDiscussions(false)
                .forksCount(16)
                .mirrorUrl(null)
                .archived(false)
                .disabled(false)
                .openIssuesCount(0)
                .license(null)
                .allowForking(true)
                .isTemplate(false)
                .webCommitSignoffRequired(false)
                .topics(new String[]{})
                .visibility("public")
                .forks(16)
                .openIssues(0)
                .watchers(203)
                .defaultBranch("master")
                .build()));
    }

    private UserResponse getExpectedUserResponse() {
        return UserResponse.builder()
                .userName("octocat")
                .displayName("The Octocat")
                .avatar("https://avatars.githubusercontent.com/u/583231?v=4")
                .geoLocation("San Francisco")
                .url("https://github.com/octocat")
                .createdAt("2011-01-25 18:44:36")
                .repos(new ArrayList<>(Collections.singletonList(UserRepository.builder().name("boysenberry-repo-1").url("https://github.com/octocat/boysenberry-repo-1").build())))
                .build();
    }
}