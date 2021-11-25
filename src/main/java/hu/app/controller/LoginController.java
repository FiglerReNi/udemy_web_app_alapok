package hu.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/loginWithText")
    @ResponseBody
    public String sayHelloText(){
        return "Hello World";
    }

    @RequestMapping(value = "/loginWithView")
    public String sayHelloView(){
        return "login";
    }
}
