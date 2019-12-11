package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: AbstractFilter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:30
 */
public abstract class AbstractFilter implements Filter {

    private AbstractFilter nextFilter;

    // 重写 fireFilter 对下一个Filter是否存在做了判断
    @Override
    public void fireFilter(Request request, Response response) {
        if (nextFilter != null) {
            nextFilter.transformEntry(request, response);
        }
    }

    // 对 doFilter 加了一个判断，用于提前结束流转
    void transformEntry(Request request, Response response) {
        if (request.getShouldPass()) {
            doFilter(request, response);
        }
    }

    public AbstractFilter getNextFilter() {
        return nextFilter;
    }

    public void setNextFilter(AbstractFilter nextFilter) {
        this.nextFilter = nextFilter;
    }
}
