package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: Client
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:58
 */
public class Client {

    private static FilterChain filterChain;

    private static void init() {
        filterChain = new FilterChain();
        filterChain.addLast(new AuthFilter());
        filterChain.addLast(new LevelFilter());
    }

    public static void main(String[] args) {
        init();
        Request requestA = Request.builder().auth("auth").level(1).isPass(true).build();
        Response responseA = Response.builder().result("").build();
        filterChain.doFilter(requestA, responseA);

        Request requestB = Request.builder().auth("AUTH").level(1).isPass(true).build();
        Response responseB = Response.builder().result("").build();
        filterChain.doFilter(requestB, responseB);

        Request requestC = Request.builder().auth("AUTH").level(-1).isPass(true).build();
        Response responseC = Response.builder().result("").build();
        filterChain.doFilter(requestC, responseC);
    }

}
