package me.dio.santander_backend_java.domain.model;/*
 *
 *@project santander-backend-java
 *@authot Clayt on 20/07/2024.
 */

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Data
@Getter
@Setter
@ToString
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL) // relacionamento um para um
    private Account account;

    @OneToOne(cascade = CascadeType.ALL) // relacionamento um para um
    private Card card;

    /* Relacionamento um para muito, Fetch: Toda vez que for no banco ele traz a lista */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    /* Relacionamento um para muito, Fetch: Toda vez que for no banco ele traz a lista */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News>  news;

}

