package com.eeposit.TrueSGNL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages="com.eeposit.TrueSGNL",exclude = {SecurityAutoConfiguration.class,ErrorMvcAutoConfiguration.class})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.eeposit.TrueSGNL.dao")
//@ComponentScan("com.eeposit.TrueSGNL")
public class TrueSGNLApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrueSGNLApplication.class, args);
	}	
	
}
