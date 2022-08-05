package com.lmaguado.practica01.configuration;

import com.lmaguado.practica01.bean.MySecondBeanImplement;
import com.lmaguado.practica01.bean.MySecondBean;
import com.lmaguado.practica01.bean.MySecondBeanOperation;
import com.lmaguado.practica01.bean.MySecondBeanOperationImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationSecondBean {

    @Bean
    public MySecondBean mySecondBean(MySecondBeanOperation mySecondBeanOperation) {
        return new MySecondBeanImplement(mySecondBeanOperation);
    }

    @Bean
    public MySecondBeanOperation mySecondBeanOperation() {
        return new MySecondBeanOperationImplement();
    }

}
