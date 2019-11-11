package com.nopainanymore.designpattern.behavior.iterator;

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

    public static void main(String[] args) {
        int i = 0;
        CustomContainer<Human> customContainer = new CustomContainer();

        List<Human> humanList = IntStream
                .range(0, 9)
                .mapToObj(num -> new Human(String.valueOf(num)))
                .collect(Collectors.toList());

        humanList.forEach(customContainer::add);

        while (customContainer.customIterator(i).hasNext()) {
            log.info("IteratorClient- main- {}", customContainer.customIterator(i).cursor);
            i++;
        }
    }
}
