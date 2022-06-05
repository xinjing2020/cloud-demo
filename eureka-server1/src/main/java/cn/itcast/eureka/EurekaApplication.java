package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: wangxiaobo
 * @create: 2022-06-04 00:27
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
     public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
     }
}
