package org.example;

import org.springframework.core.io.*;

import java.io.InputStream;
import java.io.InputStreamReader;

public class ClassPathResourceDemo {

    public static void main(String[] args) throws Exception{

        InputStream fio = null;
        InputStreamReader reader = null;
        try{
            //数据来源
            Resource resource = new ClassPathResource("test.txt");
            fio = resource.getInputStream();
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
