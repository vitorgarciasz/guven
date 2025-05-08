package src;

import src.Models.User;

import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String args[]){


        User user = new User(UUID.randomUUID(), "Userx", "userx@gmail.com", "simulação de hash", new Date());
        System.out.println("User: " + user.getName());
    }
}
