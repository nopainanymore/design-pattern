package com.nopainanymore.designpattern.creation.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: Computer
 *
 * @author NoPainAnymore
 * @date 2019-07-24 23:18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    private String cpu;

    private String gpu;

    private Integer memory;

    private Integer ssd;

    private Integer hhd;
}
