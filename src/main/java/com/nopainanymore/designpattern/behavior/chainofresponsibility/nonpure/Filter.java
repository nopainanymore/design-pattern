package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: Filter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:10
 */
public interface Filter {

    // 具体的处理逻辑
    void doFilter(Request request, Response response);

    // 传递给下一个Filter
    void fireFilter(Request request, Response response);

}
