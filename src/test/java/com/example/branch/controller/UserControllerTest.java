package com.example.branch.controller;

import com.example.branch.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import jakarta.ws.rs.core.Response;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @Mock
    private Response response;

    @InjectMocks
    private UserController userController;

    @Test
    public void test_get_user_endpoint() {

        when(userService.getUser(any())).thenReturn(response);

        assertThat(userController.getUser("mock")).isEqualTo(response);
    }
}
