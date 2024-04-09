package org.example;

import main.java.org.example.DemoUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 *    + 这是一个特殊的接口，任何 bean 如果实现了它，
 *    那么它就可以在被创建时获得对 `ResourceLoader` 的引用，这样它就可以自己加载资源。
 */
@Component
public class ResourceLoaderAwareDemo implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    public static void main(String[] args) {

        //获取上下文，注入bean
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        ResourceLoaderAwareDemo resourceLoaderAwareDemo = (ResourceLoaderAwareDemo) context.getBean("resourceLoaderAwareDemo");
        resourceLoaderAwareDemo.test();

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    private void test(){
        try{
            Resource resource = resourceLoader.getResource("test.txt");
            DemoUtil.printResource(resource);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
