package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ClassPathResourceDemo {

    public static void main(String[] args) throws Exception{

        Resource resource = new ClassPathResource("test.txt");
        DemoUtil.printResource(resource);

    }

}
