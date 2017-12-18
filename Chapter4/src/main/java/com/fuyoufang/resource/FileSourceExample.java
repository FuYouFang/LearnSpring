package com.fuyoufang.resource;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;
import org.springframework.web.context.support.ServletContextResource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class FileSourceExample {
    public static void main(String[] args) throws Exception {

        // 1. ClassPathResource
        Resource res1= new ClassPathResource("/conf/file1.txt");
        InputStream ins1 = res1.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        while ((i = ins1.read()) != -1) {
//            System.out.println(i);
            baos.write(i);
        }
        System.out.println(baos.toString());
        System.out.println(res1.getFilename());


        WritableResource res2 = new PathResource("/conf/file1.txt");


    }
}
