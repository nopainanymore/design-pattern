package com.nopainanymore.designpattern.behavior.interpreter;

import java.util.ArrayDeque;
import java.util.Map;

/**
 * design-pattern: Interpreter
 *
 * @author nopainanymore
 * @version 2019-11-17 22:02
 */
public class Interpreter {

    @FunctionalInterface
    public interface Expr {

        int interpret(Map<String, Integer> context);

        static Expr number(int number) {
            return context -> number;
        }

        static Expr plus(Expr left, Expr right) {
            return context -> left.interpret(context) + right.interpret(context);
        }

        static Expr minus(Expr left, Expr right) {
            return context -> left.interpret(context) - right.interpret(context);
        }

        static Expr variable(String name) {
            return context -> context.getOrDefault(name, 0);
        }
    }

    private static Expr parseToken(String token, ArrayDeque<Expr> stack) {
        Expr left, right;
        switch (token) {
            case "+":
                // it's necessary to remove first the right operand from the stack
                right = stack.pop();
                // ..and then the left one
                left = stack.pop();
                return Expr.plus(left, right);
            case "-":
                right = stack.pop();
                left = stack.pop();
                return Expr.minus(left, right);
            default:
                return Expr.variable(token);
        }
    }

    public static Expr parse(String expression) {
        ArrayDeque<Expr> stack = new ArrayDeque<Expr>();
        for (String token : expression.split(" ")) {
            stack.push(parseToken(token, stack));
        }
        return stack.pop();
    }
}
