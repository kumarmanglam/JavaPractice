package org.javaCore.lambdaExpression;

interface LambdaExpressionDemo2{
    void greetPerson(String name);
}

public class LambdaExpressionSingleParameter {
    public static void main(String[] args) {
        // compiler will identify the type automatically
        LambdaExpressionDemo2 demo2 = (name) -> System.out.println("Hi, "+ name  + " welcome to java world");
        demo2.greetPerson("Kumar");
    }
}
