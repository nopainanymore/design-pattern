package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

/**
 * design-pattern: AuthFilter
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:18
 */
public class AuthFilter implements Filter {

    public static final String AUTH = "AUTH";

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String preResult = response.getResult();
        if (AUTH.equals(request.getAuth())) {
            response.setResult(preResult + "auth check pass");
        } else {
            response.setResult(preResult + "auth check failure");
            request.setIsPass(false);
        }
        filterChain.doFilter(request, response, filterChain);
    }
}
