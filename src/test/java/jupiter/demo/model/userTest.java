package jupiter.demo.model;


import jupiter.demo.repository.userrepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userTest {

    @Autowired
    private userservice service;

    @MockBean
    private userrepository repository;

    @org.junit.Test
    public void getuserTest() {
        when (repository.findAll()).thenReturn(Stream.of(new user(18, "sanjana" , "18-5-98")).collect(Collectors.toList()));
        assertEquals(1, service.getAlluser().size());
    }

    @org.junit.Test
    public void adduserTest()
    {
      user user = new user(33, "ruchita" , "21-10-98");

      when(repository.save(user)).thenReturn(user);
      assertEquals(user, service.saveuser(user));
    }


    public void deleteuser()
    {
        user user = new user(8, "cincy" , "27-5-98");
        service.deleteUserById(user.getId());
        verify(repository,times(1)).deleteById(user.getId());
    }

}