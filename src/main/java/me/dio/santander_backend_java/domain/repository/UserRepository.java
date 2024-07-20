package me.dio.santander_backend_java.domain.repository;/*
 *
 *@project santander-backend-java
 *@authot Clayt on 20/07/2024.
 */

import me.dio.santander_backend_java.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
