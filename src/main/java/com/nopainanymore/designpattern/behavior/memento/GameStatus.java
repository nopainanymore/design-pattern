package com.nopainanymore.designpattern.behavior.memento;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: GameStatus
 *
 * @author nopainanymore
 * @version 2019-11-13 14:59
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class GameStatus {

    private static Gson gson = new Gson();

    private String status;

    public CheckPoint arriveCheckPoint() {
        return CheckPoint.of(this.status);
    }

    public void readCheckPoint(CheckPoint checkPoint) {
        log.info("GameStatus- readCheckPoint- checkPoint:{}", gson.toJson(checkPoint));
        this.setStatus(checkPoint.getStatus());
    }
}
