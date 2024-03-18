package org.javaCore.lambdaExpression;

interface LambdaExpressionDemo{
    public void displayMessage();
}

public class WithoutlambdaExpression {
    public static void main(String[] args) {
        LambdaExpressionDemo demo = new LambdaExpressionDemo() {
            @Override
            public void displayMessage() {
                System.out.println("Welcome to Java");
            }
        };
        LambdaExpressionDemo secondImpl = new LambdaExpressionDemo() {
            @Override
            public void displayMessage() {
                System.out.println("This is Second Implementation");
            }
        };
        secondImpl.displayMessage();
    }
}
