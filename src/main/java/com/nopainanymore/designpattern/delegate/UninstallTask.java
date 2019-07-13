package com.nopainanymore.designpattern.delegate;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: UninstallTask
 *
 * @author NoPainAnymore
 * @date 2019-07-13 22:37
 */
@Data
@Slf4j
public class UninstallTask implements ITask {

    @Override
    public void runTask() {
        log.info("UninstallTask- runTask- uninstalling");
    }
}
