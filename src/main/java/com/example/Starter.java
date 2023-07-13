package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.test9")
public class Starter {

    @Bean
//    @Scope("singleton")
    public Dima dima() {
        return new Dima("hello");
    }

    @Bean
    public Dima1 dima1() {
        return new Dima1(dima());
    }

//    @Bean
//    public Dima2 dima2() {
//        return new Dima2(dima());
//    }
}


//class StarterEx extends Starter {
//
//    Map<String, Object> map = new HashMap<>();
//
//    public Dima dima() {
//        if (!map.containsKey("dima")) {
//            map.put("dima", super.dima());
//        }
//
//        return (Dima)map.get("dima");
//    }
//
//    public Dima1 dima1() {
//        return super.dima1();
//    }
//
//    public Dima2 dima2() {
//        return super.dima2();
//    }
//
//}

