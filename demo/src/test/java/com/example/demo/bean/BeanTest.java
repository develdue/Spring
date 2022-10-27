package com.example.demo.bean;

import com.example.demo.appconfig.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);//AppConfig클래스에서 등록된 빈을 전부 가져오는 클래스

    @Test//이 메소드는 테스트용이다.
    @DisplayName("모든 빈 조회")//디스플레이이름????그냥 이름.
    void findAllBeans(){


        String[] beanDefinitionNames = ac.getBeanDefinitionNames();//

        for(String beanDefinitionName : beanDefinitionNames){
            Object bean = ac.getBean(beanDefinitionName); //KEY 값 =  VAL 값



            System.out.println("bean = "+bean + " beanDefinitionName = "+beanDefinitionName);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 조회")
    void findApplicationBean(){
        String[] beanDefinitions = ac.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitions){
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);//KEY 값 =  VAL 값


            if(beanDefinition.getRole()==BeanDefinition.ROLE_APPLICATION){
                Object bean = ac.getBean(beanDefinitionName);//KEY 값 =  VAL 값
                System.out.println("bean = "+bean + " beanDefinitionName = "+beanDefinitionName);

            }
        }
    }
}
