package eu.freakydirac.restfulspring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestfulSpringRestController {

    @RequestMapping("/user/{firstname}/{lastname}")
    public User user(@PathVariable String firstname,@PathVariable String lastname) {

        User user = new User(firstname, lastname);
        return user;
    }

}