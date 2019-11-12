package com.nopainanymore.designpattern.constructure.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Leaf
 *
 * @author nopainanymore
 * @version 2019-11-02 16:42
 */
@Slf4j
public class File extends FileHandle {

    public File(String name, Integer size) {
        super(name, size);
    }

    @Override
    void open() {
        log.info("File- open- {}", name);
    }

    @Override
    void add(FileHandle fileHandle) {
        log.info("File- add- not support");
        throw new UnsupportedOperationException("file not support add operation");
    }

    @Override
    void remove(FileHandle fileHandle) {
        log.info("File- remove- not support");
        throw new UnsupportedOperationException("file not support remove operation");
    }

    @Override
    void ls() {
//        log.info("{}", name);
//        throw new UnsupportedOperationException("file not support ls operation");
    }

    @Override
    void lsAll() {
//        log.info("{}", name);
//        throw new UnsupportedOperationException("file not support ls operation");
    }

    @Override
    Integer size() {
        return this.size;
    }
}
