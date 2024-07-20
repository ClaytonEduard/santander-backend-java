package me.dio.santander_backend_java.service;/*
 *
 *@project santander-backend-java
 *@authot Clayt on 20/07/2024.
 */

import me.dio.santander_backend_java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
