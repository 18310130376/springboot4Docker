package com.docker;

import java.util.concurrent.CountDownLatch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication 
public class DockerApplication {

	private static final Log logger = LogFactory.getLog(DockerApplication.class);
	
    @Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}
    
    public static void main(String[] args) throws InterruptedException{
    	
			new SpringApplicationBuilder().sources(DockerApplication.class).web(false).run(args);
			logger.info("====== Project started successfull ======");
		   //CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
		   //closeLatch.await();
   }
}
