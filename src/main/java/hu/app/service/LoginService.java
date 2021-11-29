package hu.app.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String name, String password){
        return name.equals("Figler Renáta") && password.equals("Szivarvany357");
    }
}
