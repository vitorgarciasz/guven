package src;

import src.Models.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String args[]){


        User user = new User(UUID.randomUUID(), "Userx", "userx@gmail.com", "simulação de hash", new Date());
        System.out.println("User: " + user.getName());

        Admin admin = new Admin(UUID.randomUUID(), "usery", "email@email.com", "password", true, new Date());

        Answer answer = new Answer(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "how to...");

        Cripto cripto = new Cripto(UUID.randomUUID(), "Bitcoin", "BTC", new BigDecimal("0.544556"));
        Post post = new Post(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "cripto", new Date());
        Wallet wallet = new Wallet(UUID.randomUUID(), UUID.randomUUID(), cripto.getId(), new BigDecimal("23432"));

        try {
            if(wallet.getUserId() != user.getId()){
                throw new RuntimeException("ERRO: O usuário de wallet não condiz com user");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
