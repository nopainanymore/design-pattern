package com.nopainanymore.designpattern.constructure.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: CompositeClient
 *
 * @author nopainanymore
 * @version 2019-11-02 16:34
 */
@Slf4j
public class CompositeClient {

    public static void main(String[] args) {
        FileHandle root = new Folder("root");
        FileHandle doc = new Folder("doc");
        FileHandle code = new Folder("code");
        FileHandle javaDoc = new File("java-doc", 1024);
        FileHandle springDoc = new File("spring-doc", 512);
        FileHandle designPattern = new File("design-pattern", 1024);

        doc.add(javaDoc);
        doc.add(springDoc);
        code.add(designPattern);

        root.add(doc);
        root.add(code);

        root.lsAll();

        log.info("CompositeClient- main- doc folder size: {}", doc.size());
        log.info("CompositeClient- main- code folder size: {}", code.size());
        log.info("CompositeClient- main- root folder size: {}", root.size());
    }
}
