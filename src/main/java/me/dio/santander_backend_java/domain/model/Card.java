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

import java.math.BigDecimal;
@Data
@Getter
@Setter
@ToString
@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    // 99.999.999.999,99
    @Column(name ="available_limit",precision = 13, scale = 2) // 11 inteiros antes da virgula, com precisao de 2
    private BigDecimal limit;

}
