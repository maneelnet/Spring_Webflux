package com.example.webflux.services;

import com.example.webflux.models.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> createUser(User user);
    Flux<User> getAllUsers();
    Mono<User> findById(Long id);
    Mono<User> updateUser(Long id, User user);
    Mono<User> deleteUser(Long id);

}
