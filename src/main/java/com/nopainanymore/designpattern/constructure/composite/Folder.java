package com.nopainanymore.designpattern.constructure.composite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * design-pattern: Folder
 *
 * @author nopainanymore
 * @version 2019-11-02 17:16
 */
@Slf4j
public class Folder extends FileHandle {

    private Set<FileHandle> fileHandleSet = new HashSet<>();

    public Folder(String name) {
        super(name, 0);
    }

    @Override
    void open() {
        log.info("Folder- open");
        ls();
    }

    @Override
    void add(FileHandle fileHandle) {
        this.fileHandleSet.add(fileHandle);
        this.size = this.size() + fileHandle.size();
    }

    @Override
    void remove(FileHandle fileHandle) {
        this.fileHandleSet.remove(fileHandle);
        this.size = this.size - fileHandle.size();
    }

    @Override
    void ls() {
        String child = fileHandleSet.stream()
                .map(FileHandle::getName)
                .filter(name -> !StringUtils.isEmpty(name))
                .collect(Collectors.joining(";"));
        log.info("{} - {}", name, child);

    }

    @Override
    void lsAll() {
        ls();
        fileHandleSet.forEach(FileHandle::lsAll);
    }

    @Override
    Integer size() {
        return fileHandleSet.stream()
                .mapToInt(FileHandle::size)
                .sum();
    }
}
