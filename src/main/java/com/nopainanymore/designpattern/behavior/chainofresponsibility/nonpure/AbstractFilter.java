package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: AbstractFilter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:30
 */
public abstract class AbstractFilter implements Filter {

    private AbstractFilter nextFilter;

    @Override
    public void fireFilter(Request request, Response response) {
        if (nextFilter != null) {
            nextFilter.transformEntry(request, response);
        }
    }

    void transformEntry(Request request, Response response) {
        if (request.getIsPass()) {
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
