package cn.anquing.dubbodemo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangquanqing
 * @since 2021/3/10 16:53
 */

@EnableDubbo
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class,args);

    }
}
