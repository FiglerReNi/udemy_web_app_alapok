package hu.app.controller;

import hu.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/loginWithText")
    @ResponseBody
    public String sayHelloText(){
        return "Hello World";
    }

    @RequestMapping(value = "/loginWithView", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/loginWithView", method = RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(!loginService.validateUser(name, password)){
            model.put("errorMessage", "Invalis Credentials");
            return "login";
        }
        model.put("name", name);
        return "welcome";
    }
}
