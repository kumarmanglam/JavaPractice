package org.javaCore.lambdaExpression;

interface LambdaExpressionDemo1{
    public void displayMessage();
}

public class LambdaExpressionDefaultMethod {
    public static void main(String[] args) {
// you are creating an instance of the LambdaExpressionDemo1 interface
// where the displayMessage() method is implemented using the lambda expression
        LambdaExpressionDemo1 demo = () -> System.out.println("Welcome to Java8");
        demo.displayMessage();
    }
}
