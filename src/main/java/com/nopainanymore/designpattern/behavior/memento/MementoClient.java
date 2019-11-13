package com.nopainanymore.designpattern.behavior.memento;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * design-pattern: MementoClient
 *
 * @author nopainanymore
 * @version 2019-11-13 14:15
 */
@Slf4j
public class MementoClient {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        Archive archive = new Archive();

        List<GameStatus> statuses = IntStream
                .range(1, 9)
                .mapToObj(level -> new GameStatus("Level" + " " + level))
                .collect(Collectors.toList());
        statuses
                .forEach(status -> archive.addCheckPoint(status.arriveCheckPoint()));

        GameStatus readCheckPoint = new GameStatus();

        archive.getCheckPoint(1).ifPresent(readCheckPoint::readCheckPoint);
        log.info("MementoClient- main- readCheckPoint:{}", gson.toJson(readCheckPoint));
    }
}
