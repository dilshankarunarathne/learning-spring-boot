package me.karunarathne.learningspringboot.service;

import me.karunarathne.learningspringboot.dao.FakeDataDao;
import me.karunarathne.learningspringboot.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.* ;
import static org.mockito.BDDMockito.given ;

import jer

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
        UUID annaUserUid = UUID.randomUUID() ;
        User anna = new User(
                annaUserUid, "anna", "montana", User.Gender.FEMALE, 30, "anna@gmail.com"
        ) ;

        ImmutableList

        given (fakeDataDao.selectAllUsers()).willReturn()
        List <User> allUsers = userService.getAllUsers() ;

        assertThat(allUsers).hasSize(1) ;
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