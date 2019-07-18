package com.nopainanymore.designpattern.behavior.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: PayState
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayState {

    private Boolean state;

    private String msg;

}
