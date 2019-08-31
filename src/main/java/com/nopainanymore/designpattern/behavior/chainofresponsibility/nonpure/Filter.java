package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: Filter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:10
 */
public interface Filter {

    void doFilter(Request request, Response response);

    void fireFilter(Request request, Response response);

}
