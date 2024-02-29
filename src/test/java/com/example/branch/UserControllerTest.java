package com.example.branch;

import com.example.branch.controller.UserController;
import com.example.branch.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.ws.rs.core.Response;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService userService;

    @Mock
    private Response response;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);

        this.userController = new UserController();

        when(userService.getUser(any())).thenReturn(response);
    }

    @Test
    public void test_get_user_endpoint() {
        assertThat(this.userController.getUser("mock")).isEqualTo(response);
    }
}
