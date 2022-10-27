package com.example.demo.appconfig;

import com.example.demo.itemservice.ItemServiceImpl;
import com.example.demo.repository.RepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//대신 의존성을 주입
public class AppConfig {

    @Bean
    public ItemServiceImpl itemService() {
        return new ItemServiceImpl(repository());
    }

    @Bean
    public RepositoryImpl repository(){
        return new RepositoryImpl();
    }

}
