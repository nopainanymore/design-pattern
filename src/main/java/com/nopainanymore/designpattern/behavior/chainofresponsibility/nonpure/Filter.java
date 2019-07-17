package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: Filter
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:10
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);

}
