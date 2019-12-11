package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: CoRNonPureClient
 *
 * @author nopainanymore
 * @version 2019-07-17 23:58
 */
@Slf4j
public class CoRNonPureClient {

    private static FilterChain filterChain;

    private static Gson gson = new Gson();

    private static void init() {
        filterChain = new FilterChain();
        filterChain.addLast(new AuthFilter());
        filterChain.addLast(new LevelFilter());
    }

    public static void main(String[] args) {
        init();
        Request requestA = Request.builder().auth("auth").level(1).shouldPass(true).build();
        Response responseA = Response.builder().result("").build();
        filterChain.doFilter(requestA, responseA);
        log.info("Client- main- result- response: {}", gson.toJson(responseA));

        Request requestB = Request.builder().auth("AUTH").level(1).shouldPass(true).build();
        Response responseB = Response.builder().result("").build();
        filterChain.doFilter(requestB, responseB);
        log.info("Client- main- result- response: {}", gson.toJson(responseB));

        Request requestC = Request.builder().auth("AUTH").level(-1).shouldPass(true).build();
        Response responseC = Response.builder().result("").build();
        filterChain.doFilter(requestC, responseC);
        log.info("Client- main- result- response: {}", gson.toJson(responseC));
    }
}
