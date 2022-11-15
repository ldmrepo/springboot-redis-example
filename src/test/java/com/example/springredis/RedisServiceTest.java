package com.example.springredis;

import com.example.springredis.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RedisServiceTest {
    @Autowired
    private RedisService redisService;

    @Test
    public void setValueTest(){
        redisService.setData("1", "1", 3000L);
        assertEquals("1", redisService.getData("1"));
        System.out.println(redisService.getData("1"));
    }
}
