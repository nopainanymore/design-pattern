package com.nopainanymore.designpattern.constructure.composite;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-11-02 16:34
 */
public class Client {

    public static void main(String[] args) {
        FileHandle root = new Folder("root");
        FileHandle doc = new Folder("doc");
        FileHandle code = new Folder("code");
        FileHandle javaDoc = new File("java-doc");
        FileHandle springDoc = new File("spring-doc");
        FileHandle designPattern = new File("design-pattern");

        doc.add(javaDoc);
        doc.add(springDoc);
        code.add(designPattern);

        root.add(doc);
        root.add(code);

        root.lsAll();
    }
}
