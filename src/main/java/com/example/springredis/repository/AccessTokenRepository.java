package com.example.springredis.repository;

import com.example.springredis.entity.AccessToken;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccessTokenRepository extends CrudRepository<AccessToken, String> {
    public Optional<AccessToken> findByToken(String token);
}
