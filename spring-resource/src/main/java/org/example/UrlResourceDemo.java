package org.example;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.io.InputStreamReader;

public class UrlResourceDemo {

    public static void main(String[] args) throws Exception {

        UrlResourceDemo urlResourceDemo = new UrlResourceDemo();
        urlResourceDemo.test1();
//        urlResourceDemo.test2();

    }

    /**
     * @param :
     * return void
     * @author cst
     * @date 2024/4/8
     * @description http:形式（默认）
     */
    private void test1() throws Exception{
        InputStream fio = null;
        InputStreamReader reader = null;
        try{
            //数据来源
            Resource resource = new UrlResource("https://dist.apache.org/repos/dist/test/test.txt");
            fio =  resource.getInputStream();
            reader = new InputStreamReader(fio,"UTF-8");

            StringBuilder sb = new StringBuilder();
            while(reader.ready()){
                sb.append((char) reader.read());
            }
            System.out.println(sb);

        } finally {
            if(fio!=null){
                fio.close();
            }
            if(reader!=null){
                reader.close();
            }
        }
    }

    /**
     * @param :
     * return void
     * @author cst
     * @date 2024/4/8
     * @description file:形式
     */
    private void test2() throws Exception{
        InputStream fio = null;
        InputStreamReader reader = null;

        try{
           //数据来源
            Resource resource = new UrlResource("file:D:\\softwore\\git\\SpringDemo\\spring-resource\\src\\main\\resources\\test.txt");
            fio =  resource.getInputStream();
            reader = new InputStreamReader(fio,"UTF-8");

            StringBuilder sb = new StringBuilder();
            while(reader.ready()){
                sb.append((char) reader.read());
            }
            System.out.println(sb);

        } finally {
            if(fio!=null){
                fio.close();
            }
            if(reader!=null){
                reader.close();
            }
        }
    }
}
