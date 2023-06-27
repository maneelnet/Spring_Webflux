package com.example.webflux.services;

import com.example.webflux.models.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> createUser(User user);
    Flux<User> getAllUsers();
    Mono<User> findById(String id);
    Flux<User> findByName(String name);
    Mono<User> updateUser(String id, User user);
    Mono<User> deleteUser(String id);

}
