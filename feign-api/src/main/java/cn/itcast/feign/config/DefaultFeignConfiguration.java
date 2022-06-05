package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author: wangxiaobo
 * @create: 2022-06-04 15:48
 * 全局自定义配置，打印日志级别
 **/
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
