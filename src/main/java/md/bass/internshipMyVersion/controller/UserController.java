package md.bass.internshipMyVersion.controller;

import md.bass.internshipMyVersion.entities.User;
import md.bass.internshipMyVersion.service.UserService;
import md.bass.internshipMyVersion.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/user" , method =  RequestMethod.GET)
    public Iterable<User> getUser(){ return userService.findUser();}

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    /*?*/ public @ResponseBody void saveUser (@RequestBody User user) { userService.saveUser(user);}

    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.DELETE)
    /*?*/public void deleteUser(@PathVariable Integer id){ userService.deleteUser(id);}

    @RequestMapping(value = "/user" ,method = RequestMethod.PUT)
    public @ResponseBody void  updateUser(@PathVariable Integer id,  User user){ userService.updateUser(user,id);}
}
