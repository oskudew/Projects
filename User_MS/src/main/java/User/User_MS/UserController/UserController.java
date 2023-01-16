package User.User_MS.UserController;

import User.User_MS.Entity.Contact;
import User.User_MS.Entity.User;
import User.User_MS.UserService.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public User_Service service;

    @Autowired
    private RestTemplate rt;

    @GetMapping(path="/{userID}",
            produces= MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<User> getUser(@PathVariable Long userID){
        User user= service.getUser(userID);
        List<Contact> list=rt.getForObject("http://Contactms/contact/"+ userID,List.class);
        user.setContact(list);
            return new ResponseEntity<User>(user, HttpStatus.OK) ;
    }
}
