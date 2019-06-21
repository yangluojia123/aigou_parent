package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者的启动类
 */
@SpringBootApplication  //标记此应用为springboot 应用
@EnableEurekaClient   //Eureka的客户端
public class PlatServiceApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication8001.class);
    }
}
