package cn.com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication //申明这是一个Spring Boot项目
public class MicroAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAApplication.class, args);
	}

}
