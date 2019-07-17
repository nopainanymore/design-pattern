package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: FilterChain
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:13
 */
public class FilterChain extends AbstractFilter {

    private AbstractFilter fistFilter = new AbstractFilter() {
        @Override
        public void doFilter(Request request, Response response) {
            super.fireFilter(request, response);
        }
    };

    private AbstractFilter end = fistFilter;

    @Override
    public void doFilter(Request request, Response response) {
        fistFilter.transformEntry(request, response);
    }

    public void addLast(AbstractFilter filter) {
        end.setNextFilter(filter);
        end = filter;
    }

}
