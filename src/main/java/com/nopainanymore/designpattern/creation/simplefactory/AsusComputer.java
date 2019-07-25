package com.nopainanymore.designpattern.creation.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: AsusComputer
 *
 * @author NoPainAnymore
 * @date 2019-07-24 23:23
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Slf4j
public class AsusComputer extends Computer {

    @Override
    void usedFor() {
        log.info("AsusComputer- usedFor- Game");
    }
}
