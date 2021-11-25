package hu.app.service;

public class UserValidationService {

    public boolean isUserValid(String name, String password){
       return name.equals("Figler Renáta") && password.equals("Szivarvany357");
    }
}
