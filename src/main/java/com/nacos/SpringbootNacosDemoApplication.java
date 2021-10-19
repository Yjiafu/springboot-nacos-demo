package com.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@NacosPropertySource(dataId = "pssc-prod.yaml", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class SpringbootNacosDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootNacosDemoApplication.class, args);
	}

}
