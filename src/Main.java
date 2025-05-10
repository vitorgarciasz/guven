package src;

import src.models.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String args[]){


        User user = new CommomUser(UUID.randomUUID(), "Userx", "userx@gmail.com", "simulação de hash", new Date());
        System.out.println("User: " + user.getName());

        Admin admin = new Admin(UUID.randomUUID(), "usery", "email@email.com", "password", true, new Date(), 65464.4, "654");

        Answer answer = new Answer(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "how to...");

        Cripto cripto = new Cripto(UUID.randomUUID(), "Bitcoin", "BTC", new BigDecimal("0.544556"));
        Post post = new Post(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "cripto", new Date());
        Wallet wallet = new Wallet(UUID.randomUUID(), user.getId(), cripto.getId(), new BigDecimal("23432"));

        try {
            if(wallet.getUserId() != user.getId()){
                throw new RuntimeException("ERRO: O id usuário informado de wallet não condiz com o id user criado");
            } else {
                System.out.println("User ID: " + user.getId() + " = Wallet UserID: " + wallet.getUserId());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*  User pode criar um post   */
        /* a lógica é feita na própria classe alterando somente o conteúdo do post */
        Post newPost = user.createPost("Hello World");

        try {
            if (newPost.getAuthorId() != user.getId()){
                throw new RuntimeException("O id do user não condiz com o autor");
            } else System.out.println("O id de user condiz com id do autor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("ID autor: " + newPost.getAuthorId() + "\nID user: " + user.getId());
    }
}
