package com.lmaguado.practica01.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void writeOnConsole() {
        System.out.println("hello, i'm the second implement.");
    }
}
