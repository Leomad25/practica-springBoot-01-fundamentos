package com.lmaguado.practica01.bean;

import jdk.dynalink.Operation;

public class MySecondBeanOperationImplement implements MySecondBeanOperation {
    @Override
    public void print() {
        System.out.println("This is a sub implement.");
    }
}
