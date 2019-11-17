package com.nopainanymore.designpattern.behavior.interpreter;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import static com.nopainanymore.designpattern.behavior.interpreter.Interpreter.parse;

/**
 * design-pattern: InterpreterClient
 *
 * @author nopainanymore
 * @version 2019-11-15 09:59
 */
@Slf4j
public class InterpreterClient {

    public static void main(String[] args) {
        Interpreter.Expr expr = parse("w x z - +");
        Map<String, Integer> context = new HashMap<>();
        context.put("w", 5);
        context.put("x", 10);
        context.put("z", 42);
        Integer result = expr.interpret(context);
        log.info("InterpreterClient- main- result:{}", result);
    }
}

