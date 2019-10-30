package com.nopainanymore.designpattern.behavior.templetemethod;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-10-30 15:55
 */
public class Client {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
