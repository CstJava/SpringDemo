package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

/**
 * 匹配获取单一文件Resource
 */
public class ResourceLoaderDemo {

    public static void main(String[] args) throws Exception{

        //http
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource httpResource = resourceLoader.getResource("https://dist.apache.org/repos/dist/test/test.txt");
        DemoUtil.printResource(httpResource);

        //文件路径
        Resource fileResource = resourceLoader.getResource("file:D:\\softwore\\git\\SpringDemo\\spring-resources\\springResourceLoader\\src\\main\\resources\\test.txt");
        DemoUtil.printResource(fileResource);

        //classpath资源
        Resource classPathResource = resourceLoader.getResource("classpath:test.txt");
        DemoUtil.printResource(classPathResource);

        //ApplicationContext 路径资源
        Resource resource = resourceLoader.getResource("test.txt");
        DemoUtil.printResource(resource);
    }

}
