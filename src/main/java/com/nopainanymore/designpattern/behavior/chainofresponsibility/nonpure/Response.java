package com.nopainanymore.designpattern.behavior.chainofresponsibility.nonpure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: Response
 *
 * @author nopainanymore
 * @version 2019-07-17 23:16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private String result = "";

}
