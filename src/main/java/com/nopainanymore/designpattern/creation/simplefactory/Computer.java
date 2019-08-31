package com.nopainanymore.designpattern.creation.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * design-pattern: Computer
 *
 * @author nopainanymore
 * @version 2019-07-24 23:18
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Computer {

    private String cpu;

    private String gpu;

    private Integer memory;

    private Integer ssd;

    private Integer hhd;

    public abstract void usedFor();
}
