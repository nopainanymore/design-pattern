package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: FilterChain
 *
 * @author nopainanymore
 * @version 2019-07-17 23:13
 */
public class FilterChain extends AbstractFilter {

    private AbstractFilter firstFilter = new AbstractFilter() {
        @Override
        public void doFilter(Request request, Response response) {
            super.fireFilter(request, response);
        }
    };

    private AbstractFilter end = firstFilter;

    @Override
    public void doFilter(Request request, Response response) {
        firstFilter.transformEntry(request, response);
    }

    public void addLast(AbstractFilter filter) {
        end.setNextFilter(filter);
        end = filter;
    }
}
