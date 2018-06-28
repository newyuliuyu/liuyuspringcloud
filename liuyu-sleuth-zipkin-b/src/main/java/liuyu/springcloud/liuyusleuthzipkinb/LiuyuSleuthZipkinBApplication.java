package liuyu.springcloud.liuyusleuthzipkinb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class LiuyuSleuthZipkinBApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiuyuSleuthZipkinBApplication.class, args);
	}
	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	@RequestMapping("/hi")
	public String home(){
//		LOG.log(Level.INFO, "hi is being called");
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info(){
//		LOG.log(Level.INFO, "info is being called");
		return restTemplate.getForObject("http://localhost:8008/info",String.class);
	}



//	@GetMapping("/trace-b")
//	public Mono<String> trace() {
//		System.out.println("===call trace-a===");
//
//		return Mono.just("Trace");
//	}
}
