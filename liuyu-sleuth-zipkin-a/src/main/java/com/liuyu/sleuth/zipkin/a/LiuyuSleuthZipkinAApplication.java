package com.liuyu.sleuth.zipkin.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class LiuyuSleuthZipkinAApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuyuSleuthZipkinAApplication.class, args);
    }

//    @Autowired
//    private LoadBalancerExchangeFilterFunction lbFunction;
//
//    @Bean
//    public WebClient webClient() {
//        return WebClient.builder().baseUrl("http://trace-b")
//                .filter(lbFunction)
//                .build();
//    }
//
//    @GetMapping("/trace-a")
//    public Mono<String> trace() {
//        System.out.println("===call trace-a===");
//
//        return webClient().get()
//                .uri("/trace-b")
//                .retrieve()
//                .bodyToMono(String.class);
//    }


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @RequestMapping("/hi")
    public String callHome(){
        //LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8009/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        //LOG.log(Level.INFO, "calling trace service-hi ");
        return "i'm service-hi";

    }
}
