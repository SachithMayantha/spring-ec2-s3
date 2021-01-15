package com.aws.springec2s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringEc2S3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEc2S3Application.class, args);
    }

}
