package az.atlacademy.spring2.controllers;

import az.atlacademy.spring2.models.User;
import az.atlacademy.spring2.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private IUsersService usersService;
    private IUsersService user;


    @GetMapping
    public String retrieveUserName(Model model, @RequestParam) {

       var user = this.user.getUserById();
        model.addAttribute("user", user);
        return "userpage";
    }
}
