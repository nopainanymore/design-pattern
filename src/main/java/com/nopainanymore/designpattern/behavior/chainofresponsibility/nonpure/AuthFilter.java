package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: AuthFilter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:18
 */
@Slf4j
public class AuthFilter extends AbstractFilter {

    private static Gson gson = new Gson();

    public static final String AUTH = "AUTH";

    @Override
    public void doFilter(Request request, Response response) {
        String preResult = response.getResult();
        if (AUTH.equals(request.getAuth())) {
            response.setResult(preResult + "auth check pass");
        } else {
            response.setResult(preResult + "auth check failure");
            request.setIsPass(false);
        }
        log.info("AuthFilter- doFilter- request:{} ,response:{}", gson.toJson(request), gson.toJson(response));
        fireFilter(request, response);
    }

}
