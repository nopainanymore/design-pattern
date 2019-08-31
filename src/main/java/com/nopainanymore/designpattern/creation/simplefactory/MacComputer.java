package com.nopainanymore.designpattern.creation.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: MacComputer
 *
 * @author nopainanymore
 * @version 2019-07-24 23:22
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Slf4j
public class MacComputer extends Computer {

    @Override
    public void usedFor() {
        log.info("MacComputer- usedFor- Work");
    }
}
