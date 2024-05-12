package com.example.designpatterns;

import com.example.designpatterns.creational.singleton.EagerRegistry;
import com.example.designpatterns.creational.singleton.LazyRegistryIODH;
import com.example.designpatterns.creational.singleton.LazyRegistryWithDCL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        LazyRegistryIODH obj1 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH obj2 = LazyRegistryIODH.getInstance();
        System.out.println(obj1.equals(obj2));
    }

}
