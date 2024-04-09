package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteArrayResourceDemo {

    public static void main(String[] args) throws Exception {
        Resource resource = new ByteArrayResource("test".getBytes());
        DemoUtil.printResource(resource);

    }
}
