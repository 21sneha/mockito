package jupiter.demo.model;

import jupiter.demo.repository.userrepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Properties;

@Service
public class userservice {


    @Autowired
    private userrepository repostiory;


    public user saveuser (user user)
    {
        return repostiory.save(user);

    }

    public List<user> getAlluser()
    {
        return repostiory.findAll();
    }

    public void deleteUserById(int Id)
    {
        repostiory.deleteById(Id);
    }
}
