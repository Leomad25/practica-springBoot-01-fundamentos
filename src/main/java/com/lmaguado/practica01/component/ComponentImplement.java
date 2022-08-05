package com.lmaguado.practica01.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void writeOnConsole() {
        System.out.println("Hello world, i'm component");
    }
}
