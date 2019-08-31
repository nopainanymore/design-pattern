package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: LevelFilter
 *
 * @author nopainanymore
 * @version 2019-07-17 23:18
 */
@Slf4j
public class LevelFilter extends AbstractFilter {

    private static Gson gson = new Gson();

    @Override
    public void doFilter(Request request, Response response) {
        String preResult = response.getResult();
        if (request.getLevel() > 0) {
            response.setResult(preResult + "level check pass");
        } else {
            response.setResult(preResult + "level check failure");
            request.setIsPass(false);
        }
        log.info("LevelFilter- doFilter- request:{} , response:{}", gson.toJson(request), gson.toJson(response));
        fireFilter(request, response);
    }
}
