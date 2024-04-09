package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PathResourceDemo {

    public static void main(String[] args) throws Exception {

        Resource resource = new PathResource("D:\\softwore\\git\\SpringDemo\\spring-resources\\springResource\\src\\main\\resources\\test.txt");
        DemoUtil.printResource(resource);

    }
}
