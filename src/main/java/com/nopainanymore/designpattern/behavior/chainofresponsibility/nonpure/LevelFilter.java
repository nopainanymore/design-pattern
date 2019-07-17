package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: LevelFilter
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:18
 */
public class LevelFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String preResult = response.getResult();
        if (request.getLevel() > 0) {
            response.setResult(preResult + "level check pass");
        } else {
            response.setResult(preResult + "level check failure");
            request.setIsPass(false);
        }
        filterChain.doFilter(request, response, filterChain);
    }
}
