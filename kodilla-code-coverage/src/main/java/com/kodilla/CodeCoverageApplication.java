package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
public class CodeCoverageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeCoverageApplication.class, args);
    }
}
