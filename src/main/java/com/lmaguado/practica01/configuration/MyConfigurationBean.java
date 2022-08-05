package com.lmaguado.practica01.configuration;

import com.lmaguado.practica01.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWhitDependency beanOperationOperationWithDependency(MyOperation myOperation) {
        return new MybeanWhitDependencyImplement(myOperation);
    }
}
