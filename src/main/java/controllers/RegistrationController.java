package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ibm on 2017-04-06.
 */
@Controller
public class RegistrationController {


    @RequestMapping("/users/register")
    public String login(){return "users/register";}
}
