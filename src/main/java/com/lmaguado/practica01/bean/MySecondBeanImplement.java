package com.lmaguado.practica01.bean;

public class MySecondBeanImplement implements MySecondBean {

    private MySecondBeanOperation mySecondBeanOperation;

    public MySecondBeanImplement(MySecondBeanOperation mySecondBeanOperation) {
        this.mySecondBeanOperation = mySecondBeanOperation;
    }

    @Override
    public void printOnConsole() {
        System.out.println("this is a simply implement.");
        mySecondBeanOperation.print();
    }
}
