package com.fuyoufang.resource;


import org.springframework.core.io.PathResource;
import org.springframework.core.io.WritableResource;

public class FileSourceExample {
    public static void main(String[] args) {

//        WritableResource resource = new ClassPathResource("/conf/file1.txt");
        WritableResource resource = new PathResource("/conf/file1.txt");


    }
}
