package br.com.rvmdigital.todolist.users;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "usuario") -> definir como será o valor dessa string na tabel do BD
    private String username;
    private String name;
    private String password;

    //Aqui ele informa quando foi crado no DB
    @CreationTimestamp
    private LocalDateTime createdAt;

}
