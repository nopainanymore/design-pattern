package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: Request
 *
 * @author NoPainAnymore
 * @date 2019-07-17 23:14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private String auth;

    private Integer level;

    private Boolean isPass = true;

}
