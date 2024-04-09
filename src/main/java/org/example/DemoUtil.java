package main.java.org.example;

import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DemoUtil {

    /**
     * @param resource:
     * return void
     * @author cst
     * @date 2024/4/9
     * @description 打印Resource inputStream 字符
     */
    public static void printResource(Resource resource) throws Exception{
        InputStream is = null;
        InputStreamReader reader = null;
        try{
            is = resource.getInputStream();
            reader = new InputStreamReader(is, StandardCharsets.UTF_8);

            StringBuilder sb = new StringBuilder();
            while(reader.ready()){
                sb.append((char)reader.read());
            }

            System.out.println(sb);
        }finally {
            if(is!=null){
                is.close();
            }
            if(reader!=null){
                reader.close();
            }
        }
    }

}
