package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * 用于匹配获取Resources 多个文件
 */
public class PathMatchingResourcePatternResolverDemo {

    public static void main(String[] args) throws Exception{
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

        Resource httpResource = pathMatchingResourcePatternResolver.getResource("https://dist.apache.org/repos/dist/test/test.txt");
        DemoUtil.printResource(httpResource);

//        Resource[] resources = pathMatchingResourcePatternResolver.getResources("*.txt");
//        Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath:*.txt");
        Resource[] resources = pathMatchingResourcePatternResolver.getResources("file:D:/softwore/git/SpringDemo/spring-resources/springResourceLoader/src/main/resources/*.txt");
        for(Resource resource:resources){
            DemoUtil.printResource(resource);
        }

    }

}
