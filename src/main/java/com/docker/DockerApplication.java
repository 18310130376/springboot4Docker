package com.docker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication 
public class DockerApplication {

	private static final Log logger = LogFactory
			.getLog(DockerApplication.class);

	public static void main(String[] args) throws InterruptedException { 
		
		 //PropertyConfigurator.configure(System.getProperty("user.dir") + "/conf/log4j.properties"); 
		System.out.println(System.getProperty("user.dir") + "/conf/log4j.properties");
		new SpringApplicationBuilder().sources(DockerApplication.class).run(
				args);
		logger.info("====== Project started successfull ======");
	}
}
