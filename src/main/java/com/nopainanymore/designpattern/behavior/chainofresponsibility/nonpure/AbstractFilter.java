package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: AbstractFilter
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:30
 */
public class AbstractFilter implements Filter {

    protected AbstractFilter nextFilter;

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

    }
}
