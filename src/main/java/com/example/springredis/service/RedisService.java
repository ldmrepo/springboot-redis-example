package com.example.springredis.service;

public interface RedisService {
    public void setData(String id, String token, Long expiredTime);
    public String getData(String id);
    public void deleteData(String id);
}
