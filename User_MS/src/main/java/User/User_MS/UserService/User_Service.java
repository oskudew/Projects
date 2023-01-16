package User.User_MS.UserService;

import User.User_MS.Entity.Contact;
import User.User_MS.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class User_Service implements UserService {

    public List<User> DummyValues() {
        List<User> l = new ArrayList<User>();
        l.add(new User(1001L, "Shreejit", 24));
        l.add(new User(1002L, "Shreya", 34));
        l.add( new User(1003L, "Sakshi", 27));
        //return l;
//        List<User> list = List.of(
//                new User(1001L, "Shreejit", 24),
//                new User(1002L, "Shreya", 34),
//                new User(1003L, "Sakshi", 27)
//        );
        return l;
    }
    @Override
    public User getUser(Long id) {
        User_Service us = new User_Service();
        //us.DummyValues()
               return us.DummyValues().stream().filter(a->a.getUserID().equals(id)).findAny().orElse(null);
    }

    //In this class we have to connect with database table



}
