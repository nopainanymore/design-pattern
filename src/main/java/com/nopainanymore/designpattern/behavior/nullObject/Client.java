package com.nopainanymore.designpattern.behavior.nullObject;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-10-30 17:49
 */
public class Client {

    public static void main(String[] args) {
        AbstractOperation operation = getOperation(true);
        operation.request();

        AbstractOperation nullOperation = getOperation(false);
        nullOperation.request();
    }

    private static AbstractOperation getOperation(Boolean condition) {
        if (condition) {
            return new RealOperation();
        } else {
            return new NullOperation();
        }
    }
}
