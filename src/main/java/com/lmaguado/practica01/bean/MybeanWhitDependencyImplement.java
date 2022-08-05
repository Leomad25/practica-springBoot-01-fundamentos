package com.lmaguado.practica01.bean;

public class MybeanWhitDependencyImplement implements MyBeanWhitDependency {

    private MyOperation myOperation;

    public MybeanWhitDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 1;
        System.out.println(myOperation.sum(number));
        System.out.println("hello from my bean whit dependency.");
    }
}
