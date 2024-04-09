package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class UrlResourceDemo {

    public static void main(String[] args) throws Exception {

        Resource httpResource = new UrlResource("https://dist.apache.org/repos/dist/test/test.txt");
        DemoUtil.printResource(httpResource);

        Resource fileResource = new UrlResource("file:D:\\softwore\\git\\SpringDemo\\spring-resources\\springResource\\src\\main\\resources\\test.txt");
        DemoUtil.printResource(fileResource);

    }

}
