package jupiter.demo.controler;


import jupiter.demo.model.user;
import jupiter.demo.model.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class usercontroller {

    @Autowired
    private userservice service;

    @PostMapping("/adduser")
    public user save(@RequestBody user user)
    {
        return service.saveuser(user);
    }

    @GetMapping("/getuser")
    public List<user> getALLUser()
    {
        return service.getAlluser();
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable int Id)
    {
        service.deleteUserById(Id);
    }
}

