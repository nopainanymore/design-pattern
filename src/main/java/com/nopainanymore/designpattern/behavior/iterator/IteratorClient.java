package com.nopainanymore.designpattern.behavior.iterator;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * design-pattern: IteratorClient
 *
 * @author nopainanymore
 * @version 2019-11-11 14:57
 */
@Slf4j
public class IteratorClient {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        int i = 0;
        CustomContainer<Human> customContainer = new CustomContainer();

        List<Human> humanList = IntStream
                .range(0, 9)
                .mapToObj(num -> new Human(String.valueOf(num)))
                .collect(Collectors.toList());

        humanList.forEach(customContainer::add);

        CustomContainer<Human>.CustomIterator customIterator = customContainer.customIterator(i);
        while (customIterator.hasNext()) {
            log.info("IteratorClient- main- cursor:{}, next:{}", customIterator.cursor, gson.toJson(customIterator.next()));
            i++;
        }
    }
}
