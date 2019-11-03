package com.nopainanymore.designpattern.constructure.composite;

import lombok.Getter;
import lombok.Setter;

/**
 * design-pattern: FileHandle
 *
 * @author nopainanymore
 * @version 2019-11-02 16:40
 */
@Getter
@Setter
public abstract class FileHandle {

    protected String name;

    public FileHandle(String name) {
        this.name = name;
    }

    abstract void open();

    abstract void add(FileHandle fileHandle);

    abstract void remove(FileHandle fileHandle);

    abstract void ls();

    abstract void lsAll();

}
