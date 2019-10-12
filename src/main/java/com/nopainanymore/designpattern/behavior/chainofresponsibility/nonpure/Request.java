package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: Request
 *
 * @author nopainanymore
 * @version 2019-07-17 23:14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private String auth;

    private Integer level;

    // 用来标识当前请求是否需要继续传递
    private Boolean isPass = true;

}
