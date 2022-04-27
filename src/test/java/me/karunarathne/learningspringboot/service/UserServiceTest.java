package me.karunarathne.learningspringboot.service;

import me.karunarathne.learningspringboot.dao.FakeDataDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserServiceTest {
    @Mock
    private FakeDataDao fakeDataDao ;
    private UserService userService ;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this) ;
        userService = new UserService(fakeDataDao) ;
    }

    @Test
    void shouldGetAllUsers() throws Exception {
    }

    @Test
    void getUser() throws Exception {
    }

    @Test
    void updateUser() throws Exception {
    }

    @Test
    void removeUser() throws Exception {
    }

    @Test
    void insertUser() throws Exception {
    }
}