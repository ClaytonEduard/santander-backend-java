package me.dio.santander_backend_java.domain.model;/*
 *
 *@project santander-backend-java
 *@authot Clayt on 20/07/2024.
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity(name = "tb_feature")
public class Feature extends BaseItem { }
